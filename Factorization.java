import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        System.out.println ("Enter a positive integer (enter 0 to exit):");
        Scanner input = new Scanner (System.in);
        int inputNumber = input.nextInt();

        if (inputNumber != 0){
            if (inputNumber == 1){
                System.out.println ("1");
            }
            else if (inputNumber == 2){
                System.out.println ("2");
            }
            else { 
                /*int factor = 2; 
                while (inputNumber > 1)
                    if (inputNumber % factor == 0){
                        System.out.println ("*" +factor);
                        inputNumber = inputNumber/factor;
                    }*/
                for (int factor = 2; factor <= inputNumber; factor++){
                    while (inputNumber % factor ==0){
                        System.out.println ("*" +factor);
                        inputNumber = inputNumber/factor;
                    }
                }
            }
        }else{ 
            System.out.println ("Succesfully Exited");
        }
    }
}
