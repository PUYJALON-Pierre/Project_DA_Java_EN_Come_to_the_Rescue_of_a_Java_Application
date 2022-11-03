package com.hemebiotech.analytics;

public class Execution {

	/*Chemin du fichier à lire*/
	
	static final String INPUTFILEPATH = "Project02Eclipse\\symptoms.txt";

	/*Chemin du fichier où écrire*/
	
	static final String OUTPUTFILEPATH = "Project02Eclipse\\results.out.txt";

	public static void main(String[] args) {


		// Instanciation de l'objet AnalyticsCounter

		AnalyticsCounter firstCounter = new AnalyticsCounter();

		firstCounter.read();
		firstCounter.sort();
		firstCounter.write();

	}

}
