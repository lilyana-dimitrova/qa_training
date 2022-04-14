import java.util.Scanner;
import java.util.StringTokenizer;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();
        System.out.println("Middle char/s is: " + findMiddleChar(word));
        scanner.nextLine();
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Count of words in that sentence: " + countTheWords(sentence));

    }

    public static String findMiddleChar(String word) {

        int length;
        int index;

        if(word.length() % 2 == 0) {
            index = (word.length() / 2) - 1;
            length = 2;
        } else {
            index = word.length() / 2;
            length = 1;
        }

        return word.substring(index, index + length);

    }

    public static int countTheWords(String sentence) {

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        return tokenizer.countTokens();
    }
}
