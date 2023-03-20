from table import table
from item import item

def sum_cost(the_store):
    le_sum = 0
    purchased_items = the_store.get_purchased()
    for i in range(len(purchased_items)):
        for item in (purchased_items[i]):
            le_sum += item.get_cost()
    return le_sum
def checkout(the_store):
        reciept = the_store.purchased_str()
        reciept += "total for today is: " + str(sum_cost(the_store))
        return reciept

def purchase(the_store, user, the_section):
        if(isinstance(user, tuple)):
            confirmed_location = the_store.find_item(user[0].lower(), the_section)
            if(confirmed_location == -1): 
                return "item does not exist"
            if(the_store.find_item_purchased(confirmed_location[2])):
                if(user[1] > 0): 
                    confirmed_location[2].amount_inc(user[1]) 
                else: 
                    return "you purchased nothing extra!"    
            else:
                if(user[1] > 0):
                    the_store.append(confirmed_location[0], confirmed_location[2])
                    confirmed_location[2].amount_inc(user[1])
                    return "you purchased " + confirmed_location[2].get_name() + "x" + str(user[1])
                else: 
                    return "you purchased nothing!"
        elif(isinstance(user, str)):
            confirmed_location = the_store.find_item(user.lower(), the_section)
            if(confirmed_location == -1): 
                return "item does not exist"
            if(not(the_store.find_item_purchased(confirmed_location[2]))):
               the_store.append(confirmed_location[0], confirmed_location[2])
            confirmed_location[2].amount_inc(1)
            return "this " + confirmed_location[2].get_name() + " has been purchased once"
        return "sorry, we can't read that!"
def remove_item(the_store, user):
        if(isinstance(user, tuple)):
            confirmed_location = the_store.find_item_2D(user[0].lower())
            if(confirmed_location == -1): 
                return "item does not exist"
            if(the_store.find_item_purchased(confirmed_location[2]) and user[1] > 0):
                confirmed_location[2].amount_inc(-user[1])
                if(confirmed_location[2].get_amount() <= 0):
                    the_store.remove(confirmed_location[0], confirmed_location[2])
                return "you removed " + confirmed_location[2].get_name() + "x" + str(user[1])
            else: return "nothing removed!"
        return "sorry, we can't read that!"

def purchase_loop(the_store, the_section):
    user_decision = input("Would you like to continue buying in this section? say yes if so: ").lower()
    if(user_decision == "yes"): 
        section_loop = True 
        print("To keep purchasing items, just keep saying their names. You are in Section", (the_section + 1))
        print(the_store.str_section(the_section))
    else: 
        section_loop = False
    while section_loop:
        print("To stop this, put \"stop\": ")
        print("to see accepted formats, put \"a_f\":")
        user_decision = eval(input("to see the section put section number in place of the item: "))
        if(user_decision == "stop"):
            section_loop = False
        elif(user_decision == "a_f"):
            print("Accepted formats: (purchases multiple) \"name of item\", anmount of item. Example: \"apple\", 3")
            print("\t\t  (purchases one) \"name of item\" Example: \"apple\"")
        elif(user_decision == (the_section + 1)):
            print(the_store.str_section(the_section))
        else:
            print(purchase(the_store, user_decision, the_section))
def remove_loop(the_store):
    remove = True
    print(the_store.purchased_str())
    while remove:
        print("To stop this, put \"stop\": ")
        print("to see accepted formats, put \"a_f\":")
        user_decision = eval(input("to see what purchased, put \"pur\": "))
        if(user_decision == "stop"):
            remove = False
        elif(user_decision == "a_f"):
            print("Only Accepted format: (removes multiple) \"name of item\", anmount of item. Example: \"apple\", 3")
        elif(user_decision == "pur"):
            print(the_store.purchased_str())
        else:
            print(remove_item(the_store, user_decision))   

def main():
    food_names = ["apple", "banana" , "orange", "slice of ham", "slice of cheese"]
    food_costs = [1.00, 0.90, 0.95, 3.00, 1.00]
    food = list(item(i, q) for i, q in zip(food_names, food_costs)) 
    candy_names = ["tootsie roll bag", "big hershey chocolate bar", "big bag of gum", "box of reeses puffs", "bag of gummies"]
    candy_costs = [5.00, 3.00, 9.59, 4.00, 15.00]
    candy = list(item(i, q) for i, q in zip(candy_names, candy_costs)) 
    electronics_names = ["television", "airpods", "bluetooth headphones", "a month of ultimate", "a year of online"]
    electronics_costs = [150.00, 90.00, 30.00, 15.00, 40.00]
    electronics = list(item(i, q) for i, q in zip(electronics_names, electronics_costs)) 
    drink_names = ["sprite box", "coke box", "fanta box", "dr. pepper box", "brisk tea box"]
    drink_costs = [6.00, 7.00, 5.00, 5.50, 3.00]
    drink = list(item(i, q) for i, q in zip(drink_names, drink_costs))
    frozens_names = ["hot pockets", "pretzels", "hot dogs", "popsicles", "chocolate pretzels"]
    frozens_costs = [12.00, 8.59, 5.00, 7.00, 4.50]
    frozens = list(item(i, q) for i, q in zip(frozens_names, frozens_costs))
    all_items = [food, candy, electronics, drink, frozens]
    the_store = table(all_items)
    store_run = True
    the_section = int(input("hi shopper, what section would you like to go today? 1, 2, 3, 4, or 5? ")) - 1
    while store_run:
        print(the_store.str_section(the_section))
        print("Accepted formats: (purchases multiple) \"name of item\", anmount of item. Example: \"apple\", 3")
        print("\t\t  (purchases one) \"name of item\" Example: \"apple\"")
        user = eval(input("Which item would you like to purchase? "))
        print(purchase(the_store, user, the_section))
        purchase_loop(the_store, the_section)
        user_decision = input("would you like to move, remove, or checkout? ").lower()
        if(user_decision == "move"): 
            the_section = int(input("move to which section? 1, 2, 3, 4, or 5? ")) - 1
        elif(user_decision == "remove"):
            remove_loop(the_store)  
            user_decision = input("would you like to move or checkout? ").lower()
            if(user_decision == "move"): 
                the_section = int(input("move to which section? 1, 2, 3, 4, or 5? ")) - 1
            else:
                print(checkout(the_store))
                store_run = False 
        else:
            print(checkout(the_store))
            store_run = False
            
        

main()