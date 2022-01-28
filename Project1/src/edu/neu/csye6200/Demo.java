package edu.neu.csye6200;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Demo extends LanguageMap {


	    public Demo(Language from, Language to) {
		super(from, to);
	}


		public String trans(Language from, Language to, String string) 
	    		throws IOException 
	    {
	        System.out.println(translate(string));
	        return translate(string);
	    }


	    public String translate(String string) 
	    {
	        HashMap<String,String> wordDictionary = super.getWordDictionary();
	        string = string.replace(" ,", " , ");
	        string = string.replace(" ?", " ? ");
	        string = string.replace(" !", " ! ");
	        List<String> words = Arrays.asList(string.split(" "));
	        words = words.stream().map(String::toLowerCase).collect(Collectors.toList());
	        List<String> translatedWords = words.stream().map(word-> wordDictionary.getOrDefault(word, word)).collect(Collectors.toList());
	        String join = String.join(" ", translatedWords);
	        join = join.replace(" , ", ",");
	        join = join.replace(" ? ", "?");
	        join = join.replace(" ! ", "!");
	        return join;

	    }
	    public static void show() throws IOException
	    {
	    	String[] sourceTexts = {"Do you have bread?", "Yes, we have no bread today!", 
	    			"Thank you!","You are welcome!"};
	    	
	    	List<String> frenchText = new ArrayList<String>();
	    	List<String> spanishText = new ArrayList<String>();
	    	
	    	System.out.println("*------------------------------*");
	    	System.out.println("\t Original Text for translation");
	    	for (int i = 0, sourceTextsLength = sourceTexts.length; i < sourceTextsLength; i++) 
	    	{
	    		System.out.println(sourceTexts[i]);
	    	}
	    	System.out.println("*------------------------------*");
	    	
	    	
	    	System.out.println("\t Translation from English to French");
	    	for (int i = 0, sourceTextsLength = sourceTexts.length; i < sourceTextsLength; i++) 
	    	{
	    		Demo demo = new Demo(Language.ENGLISH, Language.FRENCH);
	    		frenchText.add(demo.trans(Language.ENGLISH, Language.FRENCH, sourceTexts[i]));
	    	}
	    	System.out.println("*------------------------------*");
	    	
	    	
	    	System.out.println("\t Translation from English to Spanish");
	    	for (int i = 0, sourceTextsLength = sourceTexts.length; i < sourceTextsLength; i++) 
	    	{
	    		Demo demo = new Demo(Language.ENGLISH, Language.SPANISH);
	    		spanishText.add(demo.trans(Language.ENGLISH, Language.SPANISH, sourceTexts[i]));
	    	}
	    	System.out.println("*------------------------------*");
	    	
	    	
	    	System.out.println("\t Translation from French to Spanish");
	    	for (int i = 0, sourceTextsLength = frenchText.size(); i < sourceTextsLength; i++) 
	    	{
	    		Demo demo = new Demo(Language.FRENCH, Language.SPANISH);
	    		demo.trans(Language.FRENCH, Language.SPANISH, frenchText.get(i));
	    	}
	    	System.out.println("*------------------------------*");

	    	
	    	System.out.println("\t Translation from French to English");
	    	for (int i = 0, sourceTextsLength = frenchText.size(); i < sourceTextsLength; i++) 
	    	{
	    		Demo demo = new Demo(Language.FRENCH, Language.ENGLISH);
	    		demo.trans(Language.FRENCH, Language.ENGLISH, frenchText.get(i));
	    	}
	    	System.out.println("*------------------------------*");
	    	
	    	
	    	System.out.println("\t Translation from Spanish to English");
	    	for (int i = 0, sourceTextsLength = spanishText.size(); i < sourceTextsLength; i++) 
	    	{
	    		Demo demo = new Demo(Language.SPANISH, Language.ENGLISH);
	    		demo.trans(Language.SPANISH, Language.ENGLISH, spanishText.get(i));
	    	}
	    	System.out.println("*------------------------------*");
	    	
	    	
	    	System.out.println("\t Translation from Spanish to French");
	    	for (int i = 0, sourceTextsLength = spanishText.size(); i < sourceTextsLength; i++) 
	    	{
	    		Demo demo = new Demo(Language.SPANISH, Language.FRENCH);
	    		demo.trans(Language.SPANISH, Language.FRENCH, spanishText.get(i));
	    	}
	    	System.out.println("*------------------------------*");
	    	
	    	
	    }


}
