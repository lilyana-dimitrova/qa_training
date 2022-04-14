import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if palindrome: ");
        word = scanner.next();
        checkPalindrome(word);
    }

    public static boolean checkPalindrome(String word) {

        StringBuilder reversed = new StringBuilder();
        int wordSize = word.length();

        for (int i = (wordSize - 1); i >=0; --i) {
            reversed.append(word.charAt(i));
        }

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println(word + " is a Palindrome.");
            return true;
        }
        else {
            System.out.println(word + " is not a Palindrome.");
            return  false;
        }
    }


}
