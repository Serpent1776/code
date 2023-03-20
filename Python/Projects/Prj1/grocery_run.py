from storage import storage
from item import item
"""
Jack Hemling
3/19/2022
Project 1
This is my own work!!!
"""
def initalize():
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
    frozen_names = ["hot pockets", "pretzels", "hot dogs", "popsicles", "chocolate pretzels"]
    frozen_costs = [12.00, 8.59, 5.00, 7.00, 4.50]
    frozen = list(item(i, q) for i, q in zip(frozen_names, frozen_costs))
    all_items = [food, candy, electronics, drink, frozen]
    the_store = storage(all_items)
    the_run(the_store)

def purchase(the_store, the_section, the_item, amount, location):
    if(the_item in the_store.get_tab()[the_section]):
        dupe = item(the_item.get_name(), the_item.get_cost(), the_item.get_amount())
        the_tuple = the_store.find_item_purchased(the_item)    
        if(the_tuple[0]):
            the_tuple[1].amount_inc(amount)
            return "you purchased " + the_tuple[1].get_name() + "x" + str(amount)
        the_store.append(dupe, location)
        dupe.amount_inc(amount)
        return "you purchased " + dupe.get_name() + "x" + str(amount)

def remove(the_store, the_item, amount, location):
    the_tuple = the_store.find_item_purchased(the_item)
    if(the_tuple[0]):
        the_tuple[1].amount_dec(amount)
        if(the_tuple[1].get_amount() < 0):
            the_store.remove(location, the_tuple[1])
            return "the item has been removed"
        return "you removed " + the_item.get_name() + "x" + str(amount)

def section_process(the_store, the_section):
    section_loop = True
    while section_loop:
        user_decision = input("do need to see the section items or your receipt?").lower
        if(user_decision == "section items"): print(the_store.str_section(the_section))
        elif(user_decision == "your receipt"): print(the_store)
        user_decision = input("do you want to purchase, remove, or exit?").lower
        if(user_decision == "exit"):
            section_loop = False
            break
        user_name = input("Which item?").lower
        user_amount = abs(int(input("how many?")))
        confirmed_location = the_store.find_item_2D(user_name)
        if(confirmed_location != -1): 
            user_item = confirmed_location[2]
            if(user_amount > 0):
                if(user_decision == "purchase"): print(purchase(the_store, the_section, user_item, user_amount, confirmed_location[0]))
                elif(user_decision == "remove"): print(remove(the_store, user_item, user_amount, confirmed_location[0]))
        else:
            print("item does not exist")
    
def section_goto():
    the_section = 0
    while(the_section != 0):
        sections = {"food": 1, "candy": 2, "electronics": 3, "drink": 4, "frozen": 5}
        section = input("hi shopper, what section would you like to go? food, candy, electronics, drink, or frozen? ")
        the_section = sections[section]
    return the_section

def the_run(the_store):
    store_run = True
    while store_run:
        the_section = section_goto()
        print(the_store.str_section(the_section))
        print(section_process(the_store, the_section))
       

initalize()