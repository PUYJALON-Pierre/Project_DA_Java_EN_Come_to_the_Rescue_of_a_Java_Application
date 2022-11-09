package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything that will sort symptom data from a List source
 * <p>Return a map
 * @author PUYJALON Pierre
 * @since 03/11/2022
 */
public interface ISymptomSorter {

	/**
	 * @return a TreeMap of all Symptoms obtained from a list by occurence and alphabetic order
	 */
	public Map <String, Integer> occurenceSymptomsMap();

}
