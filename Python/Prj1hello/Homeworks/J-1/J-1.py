from stack import stack

def main():
    string_evaluator = stack()
    the_string = input("Hi, user give me an expression please:\nAn example: <<()>> \nparentheses - (), curly brackets - {}, square brackets - [], and triangle brackets - <> will be evaluated. \n")
    print(string_evaluator.eval(the_string))

main()