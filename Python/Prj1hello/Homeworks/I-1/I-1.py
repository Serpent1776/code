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
def input_names():
   p1_name = input("hi, what is the name of player one? ")
   p2_name = input("hi, what is the name of player two? ")
   return [p1_name, p2_name]
def main(bool): 
   n = 0
   while bool:
        if(n == 0): 
            game = Spader()
            game_deck = Deck(list([Card(t, v) for t in ["Diamond", "Spade", "Club", "Pearl"] for v in range(1,14)]))
            print("Hi, you both will be playing Spader!")
            print("You'll find out how it plays, the game has two players!")
            player_names = input_names()
            player_one = Player(player_names[0])
            player_two = Player(player_names[1])
            game.setup(game_deck, player_one, player_two)
            game.play(player_one, player_two)
        if(n > 0):
            game_deck = Deck(list([Card(t, v) for t in ["Diamond", "Spade", "Club", "Pearl"] for v in range(1,14)]))
            checker = input("game " + str(n) + " has concluded, would you like another one? Yes or No? ")
            while(checker != "Yes" and checker != "No"):
                checker = input("Yes or No? don't add extra stuff please only just Yes or No ")
            if(checker == "No"):
                bool = False
                if(player_one.get_True_wins() == player_two.get_True_wins()):
                    print("Both players have tied overall Score is " + str(player_one.get_True_wins()) + " - " + str(player_two.get_True_wins()))
                elif(player_one.get_True_wins() > player_two.get_True_wins()):
                    print(player_one.get_name() + " wins overall! Score is " + str(player_one.get_True_wins()) + " - " + str(player_two.get_True_wins()))
                else: 
                    print(player_two.get_name() + " wins overall! Score is " + str(player_one.get_True_wins()) + " - " + str(player_two.get_True_wins()))
                break
            if(checker == "Yes"):
                print("Hi, you both will be playing Spader, again!")
                print("You know how this plays!")
                checker = input("need name changes? Yes or No? ")
                while(checker != "Yes" and checker != "No"):
                    checker = input("Yes or No? don't add extra stuff please only just Yes or No ")
                if(checker == "Yes"):
                    player_names = input_names()
                    player_one.set_name(player_names[0])
                    player_two.set_name(player_names[0])
                game.setup(game_deck, player_one, player_two)
                game.play(player_one, player_two)

            
        
        n += 1

        

    

main(True)