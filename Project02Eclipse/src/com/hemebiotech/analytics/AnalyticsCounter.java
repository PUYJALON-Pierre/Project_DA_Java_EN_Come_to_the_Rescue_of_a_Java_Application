package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int pupilCount = 0;		

	public static void main(String args[]) throws Exception {
		// first get input (read symptoms.txt)

		try {
			BufferedReader reader = new BufferedReader (new FileReader("Project02Eclipse\\symptoms.txt"));
			String line = reader.readLine();


			while (line != null) {

				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headacheCount++;
				}
				else if (line.equals("rash")) {
					rashCount++;
				}
				else if (line.contains("pupils")) {
					pupilCount++;
				}
				line = reader.readLine();	// get another symptom
			}
			reader.close();

		// next generate output (write in results.out.txt)
		FileWriter writer = new FileWriter ("Project02Eclipse\\results.out.txt");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");

		writer.close();} 

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
