from Deck import Deck
from Spader import Spader
from Player import Player

def input_names():
   p1_name = input("hi, what is the name of player one? ")
   p2_name = input("hi, what is the name of player two? ")
   return [p1_name, p2_name]
def main(bool): 
   n = 0
   while bool:
        if(n == 0): 
            game = Spader()
            game_deck = Deck()
            print("Hi, you both will be playing Spader!")
            print("You'll find out how it plays, the game has two players!")
            player_names = input_names()
            player_one = Player(player_names[0])
            player_two = Player(player_names[1])
            game.setup(game_deck, player_one, player_two)
            game.play(player_one, player_two)
        if(n > 0):
            checker = input("game " + str(n) + " has concluded, would you like another one? Yes or No?")
            while(checker != "Yes" or checker != "No"):
                checker = input("Yes or No? don't add extra stuff please only just Yes or No")
            if(checker == "No"):
                bool = False
                break
            if(checker == "Yes"):
                print("Hi, you both will be playing Spader, again!")
                print("You know how this plays!")
                checker = input("need name changes? Yes or No?")
                while(checker != "Yes" or checker != "No"):
                    checker = input("Yes or No? don't add extra stuff please only just Yes or No")
                if(checker == "Yes"):
                    player_names = input_names()
                    player_one.set_name(player_names[0])
                    player_two.set_name(player_names[0])
                game.setup(game_deck, player_one, player_two)
                game.play(player_one, player_two)

            
        
        n += 1

        

    

main(True)