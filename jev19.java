package allJava;
import java.util.Scanner;
public class jev19 {
    public static void main(String[] args){
        //1.
       // int a = 11;
      //  if(a=11){} //assignment operator not use in if
        //2.
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in mathematics:");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulations, you are promoted.");
        }else{
            System.out.println("Sorry, you are not promoted please try again.");
        }
    }
}
