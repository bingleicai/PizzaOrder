/*
 * File name: Deliverable.java
 * Author: Binglei Cai 041098261
 * Course: CST8132 – OOP
 * Assignment: Assignment 2
 * Date: 2024-3-31
 * Professor: Zeinab Bayati
 * Purpose: A interface class to be used by class Pizza and SudsOrder.
 */
package servicesPkg;

/**
 * This is the interface class that has the method getDeliveryCosts
 * @author Binglei Cai
 */
public interface Deliverable {
	
	/**
	 * Calculates delivery costs
	 * @return the delivery costs
	 */
	public double getDeliveryCosts();
}