import java.util.Scanner;

public class Factorial{
    public static int factorial(int x){
        if (x > 1){
            return x * factorial(x-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int xinput = input.nextInt();
        System.out.print("The factorial of " +xinput+ " is " +factorial(xinput));
    }
}
