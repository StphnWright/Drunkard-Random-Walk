/*
 *
 * Stephen Wright
 * 07/20/2020
 *
 * A class to simulate a Drunkard random walk.
 *
 */

import java.util.Random;

public class Drunkard{

	//Declares instance variables
	private int currentAvenue;
	private int currentStreet;   
	private int initialAvenue;
	private int initialStreet;
	private Random rgen = new Random();

	//Constructor accepts integers and initializes instance variables
	public Drunkard(int x, int y){
		this.currentAvenue = x;
		this.currentStreet = y;
		this.initialAvenue = x;
		this.initialStreet = y;
	}

	//Moves the Drunkard randomly to the next position at the intersection
	public void step(){
		int walk = rgen.nextInt(4);
		switch(walk){
		case 0: currentAvenue++;
		break;
		case 1: currentAvenue--;
		break;
		case 2: currentStreet++;
		break;
		case 3: currentStreet--;
		break;
		} 
	}

	//Moves the Drunkard randomly across a number of intersections
	public void fastForward(int steps){
		for(int i = 0; i < steps; ++i){
			step();
		} 
	}

	//Indicates the current location of the Drunkard
	public String getLocation(){
		return currentAvenue + " Avenue, " + currentStreet + " Street.";
	}

	//Computes the distance traveled by the Drunkard         
	public int howFar(){
		return (Math.abs(initialAvenue - currentAvenue) + Math.abs(initialStreet - currentStreet));
	}
}   