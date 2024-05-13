/*
 * File name: Pizza.java
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
 * This is a class implementing class Deliverable to record Pizza order.
 * @author Binglei Cai
 */
public class Pizza implements Deliverable {
	
	/**size in inches*/
	private int size_in_inches;
	
	/**sauce type*/
	private String type_of_sauce;
	
	/**thin crust*/
	private boolean thin_crust;
	
	/**ham*/
	private boolean ham;
	
	/**pepperoni*/
	private boolean pepperoni;
	
	/**extra cheese*/
	private boolean extra_cheese;
	
	/**olives*/
	private boolean olives;
	
	/**mushrooms*/
	private boolean mushrooms;
	
	/**green pepper*/
	private boolean green_pepper;
	
	/**tomatoes*/
	private boolean tomatoes;
	
	/**onion*/
	private boolean onion;
	
	/**
	 * Constructs a Pizza object with size_in_inches, type_of_sauce and thin_crust.
	 * @param size_in_inches size in inches
	 * @param type_of_sauce sauce type
	 * @param thin_crust thin crust
	 */
	public Pizza(int size_in_inches, String type_of_sauce, boolean thin_crust) {
		this.size_in_inches = size_in_inches;
		this.type_of_sauce = type_of_sauce;
		this.thin_crust = thin_crust;
	}
	
	/**
	 * Constructs a Pizza object with size_in_inches and type_of_sauce.
	 * @param size_in_inches size in inches
	 * @param type_of_sauce sauce type
	 */
	public Pizza(int size_in_inches, String type_of_sauce) {
		this.size_in_inches = size_in_inches;
		this.type_of_sauce = type_of_sauce;
	}
	
	/**
	 * Sets extraCheese to true.
	 */
	public void extraCheese() {
		extra_cheese = true;
	}
	
	/**
	 * Sets green_pepper to true.
	 */
	public void addGreenPepper() {
		green_pepper = true;
	}
	
	/**
	 * Sets ham to true.
	 */
	public void addHam() {
		ham = true;
	}
	
	/**
	 * Sets mushrooms to true.
	 */
	public void addMushrooms() {
		mushrooms = true;
	}
	
	/**
	 * Sets olives to true.
	 */
	public void addOlives() {
		olives = true;
	}
	
	/**
	 * Sets onion to true.
	 */
	public void addOnion() {
		onion = true;
	}
	
	/**
	 * Sets pepperoni to true.
	 */
	public void addPepperoni() {
		pepperoni = true;
	}
	
	/**
	 * Sets tomatoes to true.
	 */
	public void addTomatoes() {
		tomatoes = true;
	}
	
	/**
	 * Returns the size of the pizza
	 * @return size in inches
	 */
	public int getSize_in_inches() {
		return size_in_inches;
	}
	
	/**
	 * Returns the delivery costs
	 * @return delivery costs
	 */
	public double getDeliveryCosts() {
		if(size_in_inches == 12) {
			return 3.50;
		} else if(size_in_inches == 14) {
			return 4.75;
		} else {
			return 0;
		}
	}
}