package edu.monmouth.inclass1;

public class InClassLab {

    public static void main(String[] args) {

// Problem 1
        for (int i = 15; i <= 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        
        
        
        
        
        
        
// Problem 2
        String townName = "we_st#2132lon+98gBr$#90an___ch";
        String lettersOnly = "";

        for (int i = 0; i < townName.length(); i++) {
            char ch = townName.charAt(i);
            if (ch >= 'A' & ch <= 'Z' || ch >= 'a' & ch <= 'z') {
                lettersOnly += ch;
            }
        }

        System.out.println(lettersOnly);

        
        
        
        
// Problem 3
        String value = new String("XMonmouth UniversityXX");
        printMiddleCharacters(value);

        
 
// Problem 4
        int sum = 0;
        for (int i = 6; i <= 14; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

// Problem 5
        for (int i = 20; i >= 4; i -= 4) {
            System.out.println(i);
        }

// Problem 6
        for (int i = 1; i <= 5; i++) {
            System.out.println("8 X " + i + " = " + (8 * i));
        }
    }

    private static void printMiddleCharacters(String value) {
        for (int i = 1; i < value.length() - 1; i++) {
            System.out.println(value.charAt(i));
        }
    }
}