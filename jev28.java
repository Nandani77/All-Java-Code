package allJava;

public class jev28 {
    public static void main(String[] args){
        //wap for simple interest. si = p*r*t/100
        //user 1: principle = 1000; rate of interest = 8.7%, timeperiod=2year
        int principal1 = 10000;
        float rateOfInterest1 = 8.7f;
        int timePeriod1 = 2;
        double si1 = principal1 * rateOfInterest1 * timePeriod1 / 100;
        System.out.println(si1);
        // user 2: principal = 130000, rateOfInterest = 10.5% , timePeriod = 4 years
        int principal2 = 130000;
        float rateOfInterest2 = 10.5f;
        int timePeriod2 = 4;
        double si2 = principal2 * rateOfInterest2 * timePeriod2 / 100;
        System.out.println(si2);


    }
}
