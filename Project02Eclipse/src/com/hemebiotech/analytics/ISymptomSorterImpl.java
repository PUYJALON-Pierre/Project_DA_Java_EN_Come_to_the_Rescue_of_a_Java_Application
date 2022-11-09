package com.hemebiotech.analytics;

import java.text.Collator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Class that can sort symptoms (implements the ISymptomSorter interface).
 * @author PUYJALON Pierre
 * @since 03/11/2022
 */
public class ISymptomSorterImpl implements ISymptomSorter{

	private ISymptomReader reader;

	/**
	 * ISymptomSorterImpl class constructor
	 */
	public ISymptomSorterImpl() {

		reader = new ISymptomReaderImpl();
	}

	/**
	 * Counts the occurrence of symptoms from a list with duplicates.
	 * @return occurenceSymptoms (TreeMap in alphabetical order that can manage accents, Key = symptoms and Value = symptoms occurence)
	 * */
	@Override
	public Map <String, Integer> occurenceSymptomsMap() {

		List<String> symptomsList  = reader.getSymptoms();

		Map <String, Integer> occurenceSymptoms = new TreeMap<>(Collator.getInstance());

		for (String symptoms :symptomsList) {

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
