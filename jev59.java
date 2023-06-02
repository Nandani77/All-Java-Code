package allJava;
class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 34;

       while (true){
           // System.out.println("I am a thread");
           System.out.println("thank you" + this.getName());
        }
    }
}
public class jev59 {
    public static void main(String[] args){
        // ready queue is maintained by jvm
        // ready queue t1 t2 t3 t4 t5;
        Mythr1 t1 = new Mythr1("Nandani1");
        Mythr1 t2 = new Mythr1("Chhot1i");
        Mythr1 t3 = new Mythr1("Nandani2");
        Mythr1 t4 = new Mythr1("Chhot2i");
        Mythr1 t5 = new Mythr1("Nandani3");
        Mythr1 t6 = new Mythr1("Chhot3i(most important)");
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
