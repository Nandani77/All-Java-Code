package allJava;

public class jev32 {
    public static void main(String [] args){
        System.out.println("Program is Started ");
        int[] myArray = {3,44,54,6,56};
        try{
            int result = myArray[1]/0;
            System.out.println(myArray[0]);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("the finally block is always executed");
        }
        try{
            String s = null;
            System.out.println(s.length());
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("Program Ends");
    }
}
