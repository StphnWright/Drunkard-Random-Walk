/*
 *
 * Stephen Wright
 * 07/20/2020
 *
 * This class represents a calendar year.
 *
 * It contains a method that determines if
 * the year is a leap year.
 *
 */

public class Year{

	//Declares instance variable
	private int year;

	//Constructor accepts integer and initializes instance variable
	public Year(int y){
		year = y;  
	}

	//Determines if input is a leap year
	public boolean isLeapYear(){
		if(year % 400 == 0){
			return true;
		}

		if(year % 100 == 0){
			return false;
		}

		return year % 4 == 0;
	}    
}    