import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int x){
            int term1 = 0;
            int term2 = 1;
            for (int count = 0; count < x; count++){
                int switchNumber = term2;
                term2 = term1 + term2;
                term1 = switchNumber;
            }
            return term1;
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int count2 = 0; count2 < n; count2++){
            System.out.println(fibonacci(count2));
        }
    }
}
