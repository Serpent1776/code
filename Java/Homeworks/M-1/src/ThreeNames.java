

public class ThreeNames implements Biggest, Comparable<String> {
    
    private String[] list;
    private boolean[] occupied = { false, false, false };
    
    public ThreeNames() {
        this.list = new String[3];
        list[0] = list[1] = list[2] = "";
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
    if (this.occupied[i])
    out += String.format("%-10s ", this.list[i]) + " ";
    else
    out += String.format("%-10s ", "----------") + " ";
    }
    return out;
    }
    public int compareTo(String o) {
        return 1;
    }
}