import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer (enter 0 to exit):");
        Scanner input = new Scanner (System.in);
        int inputNumber = input.nextInt();
        
        while (inputNumber != 0){
            if (inputNumber == 1){
                System.out.println ("1=1");
            }
            else { 
                boolean isItTheFirst = true;
                for (int factor = 2; factor <= inputNumber; factor++){
                    while (inputNumber % factor == 0){
                        if (isItTheFirst){
                            System.out.print(inputNumber+ "=" +factor);
                            isItTheFirst = false;
                        }else{
                            System.out.print("*" +factor);
                        }
                        inputNumber = inputNumber/factor;
                    }
                }
            }

            System.out.println("");
            System.out.print("Enter a positive integer (enter 0 to exit):");
            inputNumber = input.nextInt();
        }

        System.out.println ("Succesfully Exited");
    }
}
