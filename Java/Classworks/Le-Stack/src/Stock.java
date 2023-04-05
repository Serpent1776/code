
import java.util.ArrayList;
public class Stock<T> {
    /*""
  Jack Hemling
  3/12/2023
  Homework D-1
  This is my own work
"""
class stack:
    #parentheses = 0
    #square_brackets = 0
    #thans = 0
    #curly_brackets = 0
    stack = None
    def __init__(self):
            self.stack = []
    def eval(self, thy_str):
        for i in range(int(len(thy_str))):
                if(thy_str[i] == "("): 
                   self.stack.append("(")
                if(thy_str[i] == ")"): 
                   self.stack.remove("(")
                if(thy_str[i] == "["): 
                   self.stack.append("[")
                if(thy_str[i] == "]"): 
                   self.stack.remove("[")
                if(thy_str[i] == "<"): 
                   self.stack.append("<")
                if(thy_str[i] == ">"): 
                   self.stack.remove("<")
                if(thy_str[i] == "{"): 
                   self.stack.append("{")
                if(thy_str[i] == "}"): 
                   self.stack.remove("{")
                   
        return (self.stack == []) */
    private ArrayList<T> stack;

    public Stock() {
        this.stack = new ArrayList<T>();
    }
    public int size() {
        return stack.size();
    }
    public void push(T item) {
        stack.add(item);
    }
    public T pop() {
       T item = stack.get(size() - 1);
        stack.remove(size() - 1);
        return item;
    }
    public T peek() {
        return stack.get(size() - 1);
    }
    public String toString() {
        String outcome = "Size: " + stack.size() + "\nItems: \n\t";
        for(int i = stack.size() - 1; i > -1; i--) {
            outcome += stack.get(i) + "\n\t";
        }
        return outcome;
    }
   /* public boolean evaluate(String thy_str) {
        for(int i = 0; i < thy_str.length(); i++) {
            
        }
    } */
}

