package StringProgram;
import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Words");
        
        String str=s.nextLine();
        String []str1=str.split(" ");
        for(int i=0;i<str1.length;i++){
            for(int j=i+1;j<str1.length;j++){
                if(str1[i].equals(str1[j])){
                    System.out.println("DUPLICATE WORDS ARE "+str1[i]);
                }
                else
                {
                	System.out.println( "WORDS ARE "+str1[i]);
                	
                }
                	
            }
        }

    }
}