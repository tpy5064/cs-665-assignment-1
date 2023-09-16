/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.coffeeMachine.Beverage;
import edu.bu.met.cs665.coffeeMachine.CoffeeMachine;
import edu.bu.met.cs665.example1.Person;

import java.util.ArrayList;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    ArrayList<Beverage> beverages = new ArrayList<>();

    beverages.add(coffeeMachine.serveBeverage("Espresso", 0, 1));
    beverages.add(coffeeMachine.serveBeverage("Americano", 1, 2));
    beverages.add(coffeeMachine.serveBeverage("Green Tea", 0, 0));

    for(Beverage b : beverages) {
      if(b != null) {
        System.out.println("Made " + b.getType() + " with " + b.getNumMilk() + " units of milk and " +
                b.getNumSugar() + " units of sugar.");
      }
    }

  }

  /**
   * This method performs XYZ and returns String.
   *
   * @return String
   */
  private String doIt() {
    Person student = new Person("John", "Doe");
    return student.getLastName() + ',' + student.getFirstName();
  }

}
