package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptoms implements ISymptomWriter{

	/*Ecriture dans le fichier*/

	SortSymptoms occurenceSymptomesSort = new SortSymptoms();

@Override
	public void write() {
		try {
			FileWriter writer;
			writer = new FileWriter(Execution.OUTPUTFILEPATH);

			/*Efface les précédentes données du fichier resultout*/
			writer.flush();

			/*Création d'un buffereWriter pour result.out.txt car on ne peut pas écrire une map*/
			BufferedWriter bfSymptomMap = new BufferedWriter(writer);

			for (Map.Entry<String, Integer> entry: occurenceSymptomesSort.occurenceSymptomsMap().entrySet()) {
				bfSymptomMap.write(entry.getKey()+": "+entry.getValue());
				bfSymptomMap.write("\n");
			}

			bfSymptomMap.close();
			writer.close();



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}




}
