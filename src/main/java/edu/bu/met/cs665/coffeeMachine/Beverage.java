package edu.bu.met.cs665.coffeeMachine;

public class Beverage {

    private int numMilk;
    private int numSugar;
    //Flexible way to implement beverage type, prevents duplicate code of multiple classes of beverages.
    private String type;

    public Beverage(String type, int numMilk, int numSugar) {
        this.type = type;
        this.numMilk = numMilk;
        this.numSugar = numSugar;
    }

    //Getters to allow program to print the user's drink
    public int getNumMilk() {
        return numMilk;
    }

    public int getNumSugar() {
        return numSugar;
    }

    public String getType() {
        return type;
    }
}
