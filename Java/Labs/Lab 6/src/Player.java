public class Player implements Bidder{
    private int chips;
    private int currentBet;
    private String name;

    public Player(String name) {
        this.chips = 50;
        this.currentBet = 0;
        this.name = name;
    }
    public void setCurrentBet(int currentBet) {
        if(currentBet <= chips) {
        this.currentBet = currentBet;
        } else
        this.currentBet = -1;
    }
    public int getCurrentBet() {
        return currentBet;
    }
    public int getChips() {
        return chips;
    }
    public void bid(boolean situation) {
      if(situation) {
        chips += currentBet;
      } else {
        chips -= currentBet;
      }
    }
    public String toString() {
        return "Player " + name + " has " + chips + " chips.";
    }
}
