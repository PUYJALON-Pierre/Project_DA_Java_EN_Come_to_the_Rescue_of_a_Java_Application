package com.hemebiotech.analytics;

import java.text.Collator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortSymptoms {



	/*Création d'une map pour enlever les doublons et compter les occurences*/

	public Map <String, Integer> occurenceSymptomsMap() {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");

		List<String> result  = reader.GetSymptoms();

		/*Utilisation d'une Treemap afin de faire le tri dans ordre alaphabetique et nombre occurence
		 * Collator afin de trier également les accents au cas où*/

		Map <String, Integer> occurenceSymptoms = new TreeMap<>(Collator.getInstance());

		for (String symptoms :result) {

			if(occurenceSymptoms.containsKey(symptoms)) {
				occurenceSymptoms.put(symptoms, occurenceSymptoms.get(symptoms)+1);
			}
			else {
				occurenceSymptoms.put(symptoms,1);

			}

		}

		return occurenceSymptoms;
	}









}
