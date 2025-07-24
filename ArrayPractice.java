import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args){
        Random value = new Random();
        int[] randomValues = new int[10];
        for (int count = 0; count <10; count++){
            int randomValue = value.nextInt(100) +1;
            randomValues[count] = randomValue;
            System.out.println(randomValue);
        }
        int greatestNumber = randomValues[0];
        for(int oneNumber : randomValues){
            if (greatestNumber < oneNumber){
                greatestNumber = oneNumber;
            }
        }
        System.out.println("The greatest number is " +greatestNumber);
    }
}
