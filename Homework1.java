import java.util.Scanner;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int multiplyingValue = s.nextInt();
        for (int secondValue = 1; secondValue <= 10; secondValue++){
            System.out.println(multiplyingValue +"x"+ secondValue +"="+ multiplyingValue*secondValue);
        }
        Scanner t = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(100);
        int guessedNumber = t.nextInt();
        if(guessedNumber < randomNumber){
            System.out.println("Higher");
        }
        if(guessedNumber > randomNumber){
            System.out.println("Lower");
        }
        if(guessedNumber == randomNumber){
            System.out.println("Correct");
        }
        while(randomNumber != guessedNumber){
        Scanner u = new Scanner(System.in);
        int otherGuessedNumber = u.nextInt();
        if(otherGuessedNumber < randomNumber){
            System.out.println("Higher");
        }
        if(otherGuessedNumber > randomNumber){
            System.out.println("Lower");
        }
         if(otherGuessedNumber == randomNumber){
            System.out.println("Correct");
        }
    }
        //Scanner v = new Scanner(System.in);
    }
                 //Scanner.close();
}