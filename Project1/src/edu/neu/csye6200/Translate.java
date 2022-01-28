package edu.neu.csye6200;

import java.util.HashMap;

public interface Translate {
	HashMap<String,String> getWordDictionary();
	Language getOrigin();
    Language getDestination();
}
