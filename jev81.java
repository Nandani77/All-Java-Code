package allJava;
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Can not add 8 & 9";
    }

    @Override
    public String getMessage(){
        return "I am String getMessage()";
    }
}
class CustomCalculator {
    double  add(double a,double b) throws InvalidInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double  subtract(double a,double b){
        return a-b;
    }
    double  multiply(double a,double b){
        return a*b;
    }
/*    double  divide(double a,double b) throws CanNotDivideByZEROexception{
        if(b==0){
            throw new CanNotDivideByZEROexception();
        }
        return a/b;
    }*/
}
public class jev81 {
    public static void main(String[] args)throws InvalidInputException{
        CustomCalculator c = new CustomCalculator();
        c.add(8,9);
     //create custom calculator
        // followed operations
        //addition
        //subtraction
        //multiplication
        //division




    }
}
