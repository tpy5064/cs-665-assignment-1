package edu.bu.met.cs665.coffeeMachine;

public class CoffeeMachine {

    public Beverage serveBeverage(String type, int numMilk, int numSugar) {
        if(numMilk > 3 || numMilk < 0 || numSugar > 3 || numSugar < 0) {
            System.out.println("Error Making " + type +  ": Milk and Sugar counts cannot exceed 3 units " +
                    "and cannot be lower than 0 units!");
            return null;
        }

        return new Beverage(type, numMilk, numSugar);
    }
}
