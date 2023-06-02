package allJava;
interface MyCamera{
    void takeSnap();
    void  recordVideo();
    private  void greet(){
        System.out.println("Good Morning!!!");
    }
    default void  record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface Mywifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
   /* void takeSnap()
    {
        System.out.println("Taking snap");
    }*/
}
class MySmartphone extends MyCellphone implements Mywifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void  recordVideo(){
        System.out.println("record video");
    }
   /* public void  record4kVideo(){
        System.out.println("record video in 4k");
    }*/


    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String[] networkList={"nandani", "chhoti","pratibha"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting to" + network);
    }
}
public class jev50 {
    public static void main (String[] args){
        MySmartphone ms = new MySmartphone();
        ms.record4kVideo();
        String[] ar = ms.getNetwork();
        for(String item: ar){
            System.out.println(item);
        }

    }
}
