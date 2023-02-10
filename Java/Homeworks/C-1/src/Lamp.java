/*
 * Jack Hemling
 * 1/29/2023
 * Homework C-1
 * This is my own work
 */
class Lamp {
    boolean isOn;
    public Lamp() {
    this.isOn = false;
    }
    public Lamp(boolean isOn) {
    this.isOn = isOn;
    }
    public void turnOn() {
    this.isOn = true;
    }
    public void turnOff() {
    this.isOn = false;
    }
    public void flip() {
    this.isOn = !isOn;
    }
    public boolean getPower() {
    return this.isOn;
    }
    public void setLamp(boolean isOn) {
    this.isOn = isOn;
    }
    @Override
    public String toString() {
    String out;
    if (this.isOn)
    out = String.format("%3s", "ON");
    else
    out = String.format("%3s", "OFF");
    return out;
    }
    
    public boolean equals(Lamp obj) {
    return (isOn == obj.getPower()); 
    }
    }