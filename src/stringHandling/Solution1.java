package stringHandling;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.nextLine();
        System.out.print("index:\t");
        for(int i=0;i<inputString.length();i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.print("chars:\t");
        for(int i=0;i<inputString.length();i++){
            System.out.print(inputString.charAt(i) + "\t");

        }
    }
}
