package StringProgram;
import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=s.nextLine();
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;){
            System.out.println("No of words in a given string is "+str1.length);
            break;
        }


    }
}