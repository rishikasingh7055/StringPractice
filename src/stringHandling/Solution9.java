package stringHandling;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String sUpper=inputString.toUpperCase();
        String sLower=inputString.toLowerCase();
        System.out.println("inputString = " + inputString);
        int upperWeight = 0;
        int lowerWeight=0;
        for (int i = 0; i < inputString.length(); i++) {
            char n = sUpper.charAt(i);
            char m=sLower.charAt(i);
            int asciiUpper = n;
            int asciiLower= m;
            upperWeight = upperWeight + asciiUpper;
            lowerWeight=lowerWeight + asciiLower;

        }
        int absoluteWeight=upperWeight-lowerWeight;
        System.out.println("absoluteWeight = "+ Math.abs(absoluteWeight));


    }
}
