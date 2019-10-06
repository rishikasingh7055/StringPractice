package stringHandling;
import java.util.Scanner;


public class Solution2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.nextLine();
        int index=scanner.nextInt();
        String substring=inputString.substring(index);
        System.out.print(substring);
    }

}
