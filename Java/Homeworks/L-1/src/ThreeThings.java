/*
 * Jack Hemling
 * 4/4/2023
 * Homework K-1
 * This is my own work
 */  
public class ThreeThings<T> {
    private T one;
    private T two;
    private T three;

    public ThreeThings(T one, T two, T three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    public T getOne() {
        return one;
    }
    public T getTwo() {
        return two;
    }
    public T getThree() {
        return three;
    }
    public void setOne(T one) {
        this.one = one;
    }
    public void setTwo(T two) {
        this.two = two;
    }
    public void setThree(T three) {
        this.three = three;
    }
    public boolean equals(ThreeThings<T> other) {
    return (this.one.equals(other.one) && this.two.equals(other.two) && this.three.equals(other.three)); 
    }
    public void swap(int i, int d) {
        T thingOne = null;
        switch(i) {
            case 1: thingOne = this.one; break;
            case 2: thingOne = this.two; break;
            case 3: thingOne = this.three; break;
        }
        if(i == 1) {
            switch(d) {
                case 2: this.one = this.two; 
                        this.two = thingOne;
                        break;
                case 3: this.one = this.three; 
                        this.three = thingOne;
                        break;
            }
        } else if(i == 2) {
            switch(d) {
                case 1: this.two = this.one; 
                        this.one = thingOne;
                        break;
                case 3: this.two = this.three; 
                        this.three = thingOne;
                        break;
            }
        } else if(i == 3) {
            switch(d) {
                case 1: this.three = this.one; 
                        this.one = thingOne;
                        break;
                case 2: this.three = this.two; 
                        this.two = thingOne;
                        break;
            }
        }
    }
    @Override
    public String toString() {
        return this.one + ", " + this.two + ", " + this.three;
    }
}
