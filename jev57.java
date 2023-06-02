package allJava;
class Mythreadrunnable1 implements  Runnable{
    public void run(){
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
        System.out.println("I am a thread not a threat 1");
    }
}
class Mythreadrunnable2 implements  Runnable{
    public void run(){
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");

    }
}
public class jev57 {
    public static void main(String[] args){
        Mythreadrunnable1 bullet1 = new Mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);

        Mythreadrunnable2 bullet2 = new Mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
