package stringHandling;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String subStringTOBeReplace=scanner.nextLine();
        String subStringByWhichItIsReplace=scanner.nextLine();
        String s1 = inputString.replaceAll(subStringTOBeReplace,subStringByWhichItIsReplace);
        System.out.print(s1);

    }
}
