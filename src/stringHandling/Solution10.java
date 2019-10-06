package stringHandling;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        char ch=scanner.nextLine().charAt(0);
        String inputString = scanner.nextLine();
        System.out.print(inputString.indexOf(ch));
    }
}
