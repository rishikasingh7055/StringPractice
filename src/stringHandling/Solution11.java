package stringHandling;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        char ch=scanner.nextLine().charAt(0);
        String inputString = scanner.nextLine();
        int indexOfFirstOccurrence=inputString.indexOf(ch);
        for (int i=indexOfFirstOccurrence;i>=0;i=inputString.indexOf(ch,indexOfFirstOccurrence+1)){
            System.out.println(i);
        }


    }
}
