package com.hemebiotech.analytics;

/**
 * Class that define the AnalyticCounter object
 * @author PUYJALON Pierre
 * @since 03/11/2022
 */
public class AnalyticsCounter {	

	/**
	 * This method can count the number of symptoms which are present in the input file and write out the result in an output file
	 */
	public void analyticsCounterSymptoms () {
		ISymptomWriter writer = new ISymptomWriterImpl();
		writer.writeMap();
	}

}

