package allJava;

import java.util.Scanner;

public class jev70 {
    public static void main(String[] args) {
        int age = 45;
        int year_born = 2000 - 45;
        System.out.println(6 / 0);


        try {
            int a = 666 / 9;
        } catch (IllegalArgumentException e) {
            System.out.println("haa");
        } catch (ArithmeticException e) {
            System.out.println("heee");
         }

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 34;
        marks[2] = 7;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
                while(flag && i<5) {
                    try {
                        System.out.println("Enter the value of index");
                        index = sc.nextInt();
                        System.out.println("the value of marks [index] is " + marks[index]);
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Invalid index");
                        i++;
                    }
                }

    }
}
