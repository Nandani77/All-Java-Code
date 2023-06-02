package allJava;
import java.util.Scanner;

public class jev17 {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("you are experianced:");
        }
        else if(age>46){
            System.out.println("you are semi-semi experianced!");

        }
        else if(age>36){
            System.out.println("you are not experianced");

        }
        else{
            System.out.println("you are not experianced");
        }
    }
}
