package edu.monmouth.problemSet1;

import edu.monmouth.inclass1.MusicalInstrument;

public class ProblemSet2 {
    public static void main(String[] args) {

        MusicalInstrument instrument1 = new MusicalInstrument();
        System.out.println("Default MusicalInstrument object:");
        printInstrumentDetails(instrument1);

        instrument1.setName("Guitar");
        instrument1.setType("String");
        instrument1.setNumberOfKeysorStrings(6);
        System.out.println("\nModified MusicalInstrument object:");
        printInstrumentDetails(instrument1);

        MusicalInstrument instrument2 = new MusicalInstrument("Piano", "Keyboard", 88);
        System.out.println("\nMusicalInstrument object created with parameters:");
        printInstrumentDetails(instrument2);

        instrument2.setName("Snare Drum");
        instrument2.setType("Percussion");
        instrument2.setNumberOfKeysorStrings(0);
        System.out.println("\nModified MusicalInstrument object:");
        printInstrumentDetails(instrument2);

       
        MusicalInstrument instrument3 = new MusicalInstrument(null, "Unknown", -5);
        System.out.println("\nMusicalInstrument with invalid values:");
        printInstrumentDetails(instrument3);

        MusicalInstrument instrument4 = new MusicalInstrument("Violin", "Guitar", 150);
        System.out.println("\nMusicalInstrument with invalid numberOfKeysorStrings:");
        printInstrumentDetails(instrument4);
    }


    private static void printInstrumentDetails(MusicalInstrument instrument) {
        System.out.println("Name: " + instrument.getName());
        System.out.println("Type: " + instrument.getType());
        System.out.println("Number of Keys or Strings: " + instrument.getNumberOfKeysorStrings());
    }
}


