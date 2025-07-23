public class Main {

  public static void main(String[] args) {
    fac(60);
    fac(3628800);
    fac(0);
  }
  
  public static void fac(int k) {
    if (k > 1) {
      System.out.print(k + " = ");
      //fac2(k, 2);
      fac3(k, 2, 0);
    }
  }
  
  public static void fac2(int n, int factor) {
    if (n == factor) {
      // n is a prime number
      System.out.println(n);
    } else if (n % factor == 0) {
      // n can be divided by factor
      System.out.print(factor + " * ");
      fac2(n/factor, factor);
    } else {
      fac2(n, factor+1);
    }
  }
  
    public static void fac3(int n, int factor, int exp) {
    if (n == factor) {
      // n is a prime number
      System.out.println(n + "^" + (exp+1) );
    } else if (n % factor == 0) {
      // n can be divided by factor
      fac3(n/factor, factor, exp+1);
    } else {
      if (exp > 0) {
        System.out.print(factor + "^" + exp + " * ");
      }
      fac3(n, factor+1, 0);
    }
  }
}
