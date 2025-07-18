import java.util.Scanner;
import java.util.Random;

public class Homework1 {

    static void MultiplicationTable() {
        
        Scanner s = new Scanner(System.in);
        int multiplyingValue = s.nextInt();

        for (int secondValue = 1; secondValue <= 10; secondValue++){
            System.out.println(multiplyingValue +"x"+ secondValue +"="+ multiplyingValue*secondValue);
        }
    }

    static void GuesstheNumber(){
         Scanner t = new Scanner(System.in);
        Random r = new Random();
        // int maximum = 100;
        // int minimum = 1;
        int randomNumber = r.nextInt(100)+1;
        int guessedNumber = t.nextInt();
        if(guessedNumber < randomNumber){
            System.out.println("Too low");
        }
        else if(guessedNumber > randomNumber){
            System.out.println("Too high");
        }
        else{
            System.out.println("Correct");
        }
        do {
            Scanner u = new Scanner(System.in);
            int otherGuessedNumber = u.nextInt();
            if(otherGuessedNumber < randomNumber){
                System.out.println("Too low");
            }
            else if(otherGuessedNumber > randomNumber){
                System.out.println("Too high");
            }
            else{
                System.out.println("Correct");
            }
        }
        while(randomNumber != guessedNumber);
    }
    public static void main(String[] args) {

        MultiplicationTable();

        GuesstheNumber();

    }
}