package allJava;

public class jev29 {
    public static void main(String[] args){
        calculateSimpleInterest(100003, 4.5f, 8);
        calculateSimpleInterest(45334,5.6f,4);

    }
    public static void calculateSimpleInterest(int principal,float rateOfInterest, int timePeriod){
        double si = principal * rateOfInterest * timePeriod / 100;
        System.out.println(si);
        return ;
    }

}
