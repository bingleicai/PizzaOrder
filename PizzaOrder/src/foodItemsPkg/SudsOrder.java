/*
 * File name: SudsOrder.java
 * Author: Binglei Cai 041098261
 * Course: CST8132 – OOP
 * Assignment: Assignment 2
 * Date: 2024-3-31
 * Professor: Zeinab Bayati
 * Purpose: A class implementing Deliverable.
 */
package foodItemsPkg;

import servicesPkg.Deliverable;

/**
 * This is a class implementing class Deliverable to record suds order.
 * @author Binglei Cai
 */
public class SudsOrder implements Deliverable {
	
	/**name of the suds order*/
	private String name;
	
	/**number of the suds order*/
	private int number;
	
	/**size of the suds order*/
	private int size_in_ml;
	
	/**
	 * Constructs a Pizza object with size_in_inches, type_of_sauce and thin_crust.
	 * @param name name of the suds order
	 * @param number number o the suds order
	 * @param size_in_ml size of the suds order
	 */
	public SudsOrder(String name, int number, int size_in_ml) {
		this.name = name;
		this.number = number;
		this.size_in_ml = size_in_ml;
	}
	
	/**
	 * Returns the name of the suds order
	 * @return name of the suds order
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the number of the suds order
	 * @return number of the suds order
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Returns the size of the suds order
	 * @return size of the suds order
	 */
	public int getSize_in_ml() {
		return size_in_ml;
	}
	
	/**
	 * Returns String representation of SudsOrder object
	 * @return String representation of SudsOrder object
	 */
	public String toString() {
		return String.format("Name: %s\n Number: %d\n Delivery Costs: %.2f", name, number, getDeliveryCosts());
	}
	
	/**
	 * Calculates delivery costs
	 * @return the delivery costs
	 */
	public double getDeliveryCosts() {
		return 0.75 * number;
	}
}