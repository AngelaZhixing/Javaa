import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inputWord = input.nextLine();
        StringBuffer reversedStringBuilder = new StringBuffer(inputWord);
        reversedStringBuilder.reverse();
        String reversedString = reversedStringBuilder.toString();
        if(inputWord.equals(reversedString)){
            System.out.println(inputWord + " is a palindrome.");
        } else {
            System.out.println(inputWord + " is not a palindrome.");
        }
    }
}
