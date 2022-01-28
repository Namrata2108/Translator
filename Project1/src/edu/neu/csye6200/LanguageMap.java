package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public abstract class LanguageMap implements Translate{
	private final String dictionary;
	private final HashMap<String, String> words;
	private Language origin;
	private Language destination;

	    public LanguageMap(Language from, Language to)  
	    {
	        words = new HashMap<>();
	        dictionary = "src/edu/neu/csye6200/" + from.toString() + "-" + to.toString() + ".csv";
	        this.origin = from;
	        this.destination = to;
	        readFile();
	    }
	    private void readFile()  {
	    	BufferedReader in = null;
	    	try {
	    		 in = new BufferedReader(new FileReader(dictionary));
	    	} catch(Exception e) {
	    		e.printStackTrace();
	    	}
	        String line;

	        try {
				while ((line = in.readLine()) != null) {
				    String[] columns = line.split(",");
				    if (!words.containsKey(columns[0])) {
				        words.put(columns[0], columns[1]);
				    }

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        //System.out.println("Reading complete!!");
	    }

	    public HashMap<String,String> getWordDictionary(){
	        return this.words;
	    }

	    public Language getOrigin(){
	        return this.origin;
	    }

	    public Language getDestination(){
	        return this.destination;
	    }

}

