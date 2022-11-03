package com.hemebiotech.analytics;


public class AnalyticsCounter {	

	public void read() {
		ISymptomReader reader = new ReadSymptomDataFromFile(null);
		reader.GetSymptoms();
	};

	public void sort() {
		ISymptomSorter sorter = new SortSymptoms();
		sorter.occurenceSymptomsMap();
	};

	public void write() {
		ISymptomWriter writer = new WriteSymptoms();
		writer.write();
	};


}

