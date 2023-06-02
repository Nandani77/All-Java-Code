package allJava;

import java.util.Scanner;

public class jev63 {
    public  static void main(String[] args){
        // syntax error
        // int a =0 error : no semicolon
        // b= 8; error : b not declared
        //wap to print prime number in 1 to 10.
        /*System.out.println(2);
        for(int i = 1; i<10;i++){
            System.out.println(2*i+1);
        }*/
        // logical error


        // runtime error
        // know as exception
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("integer part of 1000 divided by k is "+ 1000/k);
    }


}
