package allJava;
interface MyCamera2{
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
interface Mywifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellphone2{
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
class MySmartphone2 extends MyCellphone implements Mywifi2, MyCamera2{
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

public class jev52 {
    public static void main(String[] args){
        MyCamera2 cam1 = new MySmartphone2();// this is the smartphone but, use it  as a camera.
        cam1.record4kVideo();//can only use record or camera method
        MySmartphone2 s = new MySmartphone2();
        s.recordVideo();
        s.getNetwork();
        s.callNumber(1024245455);
        s.toString();



    }
}
