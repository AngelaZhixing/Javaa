public class Main {
    
    public static int field = 8;

    public static void main(String[] args) {
        // Call the counting method
        int anumber = 100;
        for (int i=1; i <= anumber; i++) {
            System.out.println(add(i) );
        }
        System.out.println(fibbonacci(7));

        System.out.println("Hello qwerty");

        System.out.println(AreaTriangle(3.0f, 4.0f));
    }

    public static float AreaTriangle(float base, float height) {
        return base * height / 2.0f;
    }
    public static int add(int parameter) {
        return parameter + field;
    }

    //public static int remainder(int parameter)

    public static int fibbonacci(int n) {
        int x = 0;
        int y = 1;
        for (int i = 0; i < Math. abs(n); i++){
            int temp = y;
            y = x+y;
            x = temp;
        }
        return x;
    }
}
