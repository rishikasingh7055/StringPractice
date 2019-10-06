package stringHandling;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("inputString = " + inputString);
        int totalWeight = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char n = inputString.charAt(i);
            int ascii = n;
            totalWeight = totalWeight + ascii;
        }
        System.out.println("totalWeight = "+ totalWeight);
    }
}
