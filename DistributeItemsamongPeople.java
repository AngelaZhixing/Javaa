import java.util.Scanner;

public class DistributeItemsamongPeople {
    public static int distribution(int objects, int people){
        int sum = 0;
        if (objects > 1 && people > 1){
            for (int a = 1; a <= objects-people+1; a++){
                sum += distribution(objects-a, people-1);
            }
        }else if (objects == 1 && people > 1){
            sum = 0;
        }else if (objects > 1 && people == 1){
            sum = 1;
        }else if (objects == 1 && people == 1){
            sum = 1;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("How many objects do you want to distribute?");
        int objectsInput = input.nextInt();
        System.out.println ("How many people do want to distribute the objects to?");
        int peopleInput = input.nextInt();
        System.out.println (distribution(objectsInput, peopleInput));
    }
}
