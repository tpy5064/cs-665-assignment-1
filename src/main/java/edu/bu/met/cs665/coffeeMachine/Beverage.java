package edu.bu.met.cs665.coffeeMachine;

public abstract class Beverage {
    public enum BeverageType {
        ESPRESSO, AMERICANO, LATTE_MACCHIATO,
        BLACK_TEA, GREEN_TEA, YELLOW_TEA
    }

    private int numMilk;
    private int numSugar;
    private BeverageType type;

    public Beverage(BeverageType type, int numMilk, int numSugar) {
        this.type = type;
        this.numMilk = numMilk;
        this.numSugar = numSugar;
    }
}
