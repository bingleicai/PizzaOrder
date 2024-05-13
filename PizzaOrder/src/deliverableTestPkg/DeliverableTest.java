/*
 * File name: DeliverableTest.java
 * Author: Binglei Cai 041098261
 * Course: CST8132 – OOP
 * Assignment: Assignment 2
 * Date: 2024-3-31
 * Professor: Zeinab Bayati
 * Purpose: A class to test class Deliverable, Pizza and SudsOrder.
 */
package deliverableTestPkg;

import servicesPkg.Deliverable;
import foodItemsPkg.Pizza;
import foodItemsPkg.SudsOrder;

/**
 * class to create some instances of Deliverable and process them polymorphically. 
 * Ensure that you clean up your code and add comments to show good coding practices.
 * @author Binglei Cai
 */
public class DeliverableTest {
	final static boolean ThinCrust=true;
	/**
	 * This is the entry point for the application, it instantiates Pizza and SudsOrder objects
	 * and store them inside Deliverable array and calls the getDeliveryCosts methods respectively.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(12, "pesto", ThinCrust);
		pizza1.addMushrooms();
		pizza1.addOnion();
		pizza1.addOlives();
		pizza1.addGreenPepper();
		
		Pizza pizza2 = new Pizza(14, "marinara");
		pizza2.addPepperoni();
		pizza2.addMushrooms();
		pizza2.addGreenPepper();
		pizza2.extraCheese();
		
		Deliverable[] deliverableItems = {
				pizza1,
				pizza2,
				new SudsOrder("Rollicking Root Beer", 6, 473),
				new SudsOrder("Super Citrus Fizz", 4, 473)
		}; 
		
		System.out.printf("%-22s %-15s %s\n", "Items", "Number/Size", "Cost");
		int numberOfPizza = 0;
		for(Deliverable item : deliverableItems) {
			String itemName = "";
			int size = 0;
			if(item instanceof Pizza) {
				numberOfPizza++;
				itemName = "Pizza " + numberOfPizza;
				size = ((Pizza) item).getSize_in_inches();
			} else if(item instanceof SudsOrder) {
				itemName = ((SudsOrder) item).getName();
				size = ((SudsOrder) item).getNumber();
			}
			System.out.printf("%-22s %-15d %.2f\n", itemName, size, item.getDeliveryCosts());
		}
	}
}