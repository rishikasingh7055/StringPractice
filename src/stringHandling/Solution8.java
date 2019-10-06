package stringHandling;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String s1=inputString.toUpperCase();
        System.out.println("inputString = " + inputString);
        int upperWeight = 0;
        for (int i = 0; i < s1.length(); i++) {
            char n = s1.charAt(i);
            int ascii = n;
            upperWeight = upperWeight + ascii;
        }
        System.out.println("upperWeight = "+ upperWeight);


    }
}
