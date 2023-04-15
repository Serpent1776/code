/*
 * Jack Hemling
 * 4/15/2023
 * Homework M-1 
 * Codes from notes M and modified by me.
 */  
public class ThreeNames implements Biggest, Comparable<ThreeNames> {
    
    private String[] list;
    private boolean[] occupied = { false, false, false };
    
    public ThreeNames() {
        this.list = new String[3];
        list[0] = list[1] = list[2] = "";
    }
    public ThreeNames(String one, String two, String three) {
        this.list = new String[3];
        this.list[0] = one;
        this.list[1] = two;
        this.list[2] = three;
        for(int i = 0; i < this.list.length; i++) {
            if(!(this.list[i].equals(""))) {
            this.occupied[i] = true;
            }
        }

        
    }
    public void assign(int pos, String name) {
        this.list[pos] = name;
        this.occupied[pos] = true;
    }
    public boolean validIndex(int pos) {
        return pos >= 0 && pos < 3;
    }
    public boolean notEmpty() {
        return !this.occupied[0] && !this.occupied[1] && !this.occupied[2];
    }
    
    public double max() {
        int len1 = this.list[0].length();
        int len2 = this.list[1].length();
        int len3 = this.list[2].length();
        return (double) Math.max(Math.max(len1, len2), len3);
    }
    @Override
    public String toString() {
    // String out = "---";
    String out = "";
    for (int i = 0; i < 3; i++) {
    out += i + ":";
    if (i < 2) 
    if (this.occupied[i])
    out += this.list[i] + " ";
    else
    out += "----------" + " ";
    else
    if (this.occupied[i])
    out += this.list[i] + "";
    else
    out += "----------" + "";
    }
    return out;
    }
    public int compareTo(ThreeNames o) {
        int subtr = 0;
         for(int i = 0; i < 3; i++) {
            subtr = list[i].length() - o.list[i].length();
            if(subtr != 0) {
            return subtr;
            }
        }
         
        return subtr;
    }
}