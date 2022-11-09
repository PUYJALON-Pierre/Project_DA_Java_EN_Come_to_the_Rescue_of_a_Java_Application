package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used to read a file containing symptoms (Implements the ISymptomReader interface).
 * @author PUYJALON Pierre
 * @since 03/11/2022
 */
public class ISymptomReaderImpl implements ISymptomReader {

	/**
	 * Path of the text file to read.
	 */
	final String INPUTFILEPATH = "Project02Eclipse\\symptoms.txt";

	/**
	 * Read symptoms from a text file line by line and return a list of symptoms that may contains duplications.
	 * @return symptomsList : represents a List of symptoms.
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> symptomsList = new ArrayList<String>();

		if (INPUTFILEPATH != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(INPUTFILEPATH));
				String line = reader.readLine();

				while (line != null) {
					symptomsList.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return symptomsList;
	}

}
