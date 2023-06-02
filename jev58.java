package allJava;
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you");
    /*    while (true){
            System.out.println("I am a thread");
        }*/
    }
}
public class jev58 {
    public static  void main(String[] args){
        Mythr t1 = new Mythr("Nandani");
        Mythr t2 = new Mythr("Chhoti");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());

        System.out.println("The id of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());

        System.out.println("The id of the thread t is " + t2.getName());



    }
}
