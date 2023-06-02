package allJava;
interface Bicycle{
    int a = 445;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHormmhn();
}
class  AvonCycle implements Bicycle, HornBicycle{
    void  blowHorn(){
        System.out.println("pee poo pee poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedup(int increment){
        System.out.println("Applying speedup");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gam pee poop pee poo");
    }
    public void blowHormmhn(){
        System.out.println("main hoon na poo poo pee pee ");
    }

}
public class jev49 {
    public static void main(String[] args){
        AvonCycle cycleNandani = new AvonCycle();
        cycleNandani.applyBrake(1);
        System.out.println(cycleNandani.a);
        cycleNandani.blowHormmhn();
        cycleNandani.blowHornk3g();


    }
}
