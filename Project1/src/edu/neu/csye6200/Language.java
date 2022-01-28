package edu.neu.csye6200;

public enum Language {
	ENGLISH("en"),
    SPANISH("es"),
    FRENCH("fr");

    private final String shortHand;

    Language(String shortHand) {
        this.shortHand = shortHand;
    }

    @Override
    public String toString(){
        return this.shortHand;
    }

}
