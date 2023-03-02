"""
  Jack Hemling
  3/1/2023
  Homework D-1
  This is my own work
 """
from Deck import Deck
from Spader import Spader
from Player import Player
from Card import Card
"""
input_names() sends the names for Player class' instantiation
"""
def input_names():
   p1_name = input("hi, what is the name of player one? ")
   p2_name = input("hi, what is the name of player two? ")
   return [p1_name, p2_name]
"""
main() runs games of spader infinitely until the players say, "No" via a while loop.
"""
def main(bool): 
   n = 0
   while bool: #the "infinite" while loop
        if(n == 0): #base iteration
            game = Spader()
            game_deck = Deck(list([Card(t, v) for t in ["Diamond", "Spade", "Club", "Pearl"] for v in range(1,14)])) #deck made
            print("Hi, you both will be playing Spader!")
            print("You'll find out how it plays, the game has two players!")
            player_names = input_names()
            player_one = Player(player_names[0])
            player_two = Player(player_names[1])
            game.setup(game_deck, player_one, player_two)
            game.play(player_one, player_two)
        if(n > 0): #all other iterations
            game_deck = Deck(list([Card(t, v) for t in ["Diamond", "Spade", "Club", "Pearl"] for v in range(1,14)])) #deck remade
            checker = input("game " + str(n) + " has concluded, would you like another one? Yes or No? ")
            while(checker != "Yes" and checker != "No"): #Demorgan while loop to prevent errors
                checker = input("Yes or No? don't add extra stuff please only just Yes or No ")
            if(checker == "No"): #game ends on no with overall wins
                bool = False
                if(player_one.get_True_wins() == player_two.get_True_wins()):
                    print("Both players have tied overall Score is " + str(player_one.get_True_wins()) + " - " + str(player_two.get_True_wins()))
                elif(player_one.get_True_wins() > player_two.get_True_wins()):
                    print(player_one.get_name() + " wins overall! Score is " + str(player_one.get_True_wins()) + " - " + str(player_two.get_True_wins()))
                else: 
                    print(player_two.get_name() + " wins overall! Score is " + str(player_one.get_True_wins()) + " - " + str(player_two.get_True_wins()))
                break
            if(checker == "Yes"): #game continues on yes 
                print("Hi, you both will be playing Spader, again!")
                print("You know how this plays!")
                checker = input("need name changes? Yes or No? ")
                while(checker != "Yes" and checker != "No"): #Demorgan while loop to prevent errors
                    checker = input("Yes or No? don't add extra stuff please only just Yes or No ")
                if(checker == "Yes"): #names are changed on yes by the checker here
                    player_names = input_names()
                    player_one.set_name(player_names[0])
                    player_two.set_name(player_names[1])
                game.setup(game_deck, player_one, player_two) #game replays
                game.play(player_one, player_two)

            
        
        n += 1

        

    

main(True)