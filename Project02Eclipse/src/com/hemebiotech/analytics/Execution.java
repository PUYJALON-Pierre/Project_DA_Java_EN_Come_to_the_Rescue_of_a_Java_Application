package com.hemebiotech.analytics;

public class Execution {

	public static void main(String[] args) {


		// Instanciation de l'objet AnalyticsCounter

		AnalyticsCounter firstCounter = new AnalyticsCounter();

		firstCounter.read();
		firstCounter.sort();
		firstCounter.write();

	}

}
