package allJava;
import java.util.Scanner;
public class jev18 {
    public static void main(String[] args ){
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to become an Adult!");
                break;
            case 25:
                System.out.println("you are going to join a job!");
                break;
            case 70:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");

        }
        System.out.println("thanks for read my java program");
    }
}
