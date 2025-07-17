package assignment2;

import java.util.Scanner;

public class CheckPalindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String originalSentence = scanner.nextLine();

        
        String cleanedSentence = originalSentence.toLowerCase().replace(" ", "");

        
        String reversedSentence = "";
        for (int index = cleanedSentence.length() - 1; index >= 0; index--) {
            reversedSentence += cleanedSentence.charAt(index);
        }

     
        boolean isPalindrome = cleanedSentence.equals(reversedSentence);

        
        System.out.println("IS given sentence palidrome :" + isPalindrome);

        scanner.close();
    }
}
