package com.hemebiotech.analytics;

/**
 *Main class of a trend analysis program that can read from a file, sort and write symptoms with their occurrences into another file.
 *@author PUYJALON Pierre
 *@since 03/11/2022
 *@version 1.0.0
 */
public class Execution {

	/**
	 * Main method of the trend analysis program
	 * @param args : String array
	 */
	public static void main(String[] args) {

		// Instantiating the AnalyticsCounter Object
		
		AnalyticsCounter firstCounter = new AnalyticsCounter();

		firstCounter.analyticsCounterSymptoms();

	}

}
