package com.hemebiotech.analytics;


public class AnalyticsCounter {	



	public void read() {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(null);
		reader.GetSymptoms();
	};

	public void sort() {
		SortSymptoms sorter = new SortSymptoms();
		sorter.occurenceSymptomsMap();
	};

	public void write() {
		WriteSymptoms writer = new WriteSymptoms();
		writer.write();
	};


}

