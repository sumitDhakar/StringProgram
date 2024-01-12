package StringProgram;

import java.util.Scanner;

public  class MaxWord {
    public static void main(String[] args) {
    	 Scanner s =new Scanner(System.in);
         System.out.println("Enter you String");
         String str=s.nextLine();
          String[] words = str.split(" ");
        
        String maxWord = " ";
        
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }
        
        System.out.println("Longest word: " + maxWord);
    }
}
