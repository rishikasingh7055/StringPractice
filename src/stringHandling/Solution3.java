package stringHandling;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String sLower = inputString.toLowerCase();
        for(int i=0;i<inputString.length();i++){
        char n= sLower.charAt(i);
        if(n=='a' || n=='e'|| n=='i'|| n=='o'|| n=='u'){
            sLower=sLower.replace(n,'*');
        }


    }
        System.out.print(sLower);



    }
}
