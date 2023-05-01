class Card {
    private String cvalue;
    private String csuit;

    public Card(String cvalue, String csuit) {
        this.cvalue = cvalue;
        this.csuit = csuit;
    }
    public String getCsuit() {
        return csuit;
    }
    public String getCvalue() {
        return cvalue;
    }
    public void setCsuit(String csuit) {
        this.csuit = csuit;
    }
    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }
    public boolean equalSuit(Card other) {
       return this.csuit.equals(other.getCsuit());
    }
    public boolean equalValue(Card other) {
        return this.cvalue.equals(other.getCvalue());
     }
     public boolean equals(Card other) {
        return equalSuit(other) && equalValue(other);
     }
     @Override
     public String toString () {
        return this.csuit + this.cvalue; 
     }
}
