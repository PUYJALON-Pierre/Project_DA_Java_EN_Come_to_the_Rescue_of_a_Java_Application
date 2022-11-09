package com.hemebiotech.analytics;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Class that can write symptoms into a file (implements the ISymptomWriter interface)
 * @author PUYJALON Pierre
 * @since 03/11/2022
 */
public class ISymptomWriterImpl implements ISymptomWriter{

	/**
	 * Path of the text file to write.
	 */
	final String OUTPUTFILEPATH = "Project02Eclipse\\results.out.txt";

	private ISymptomSorter occurenceSymptomesSort;

	/**
	 * ISymptomWriterImpl class constructor
	 */
	public ISymptomWriterImpl() {
		occurenceSymptomesSort = new ISymptomSorterImpl();
	}

	/**
	 * Writing a symptom Map from a list by using a BufferredWriter, into a file which path is OUTPUFILEPATH.
	 */
	@Override
	public void writeMap() {
		try {
			FileWriter writer;
			writer = new FileWriter(OUTPUTFILEPATH);

			//Clear previous data from the output text file
			writer.flush();

			BufferedWriter bfSymptomMap = new BufferedWriter(writer);

			for (Map.Entry<String, Integer> entry: occurenceSymptomesSort.occurenceSymptomsMap().entrySet()) {
				bfSymptomMap.write(entry.getKey()+": "+entry.getValue());
				bfSymptomMap.write("\n");
			}

			bfSymptomMap.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
