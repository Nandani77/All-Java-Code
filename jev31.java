package allJava;

public class jev31 {
    public  static void main(String[] args ){
        System.out.println("Program Started");
        int[] myArray = {3,23,43,2};
        try {
            System.out.println(myArray[2]);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }finally {
            System.out.println("tha finally block is always executed");
        }
        System.out.println("Program Ends");
    }
}
