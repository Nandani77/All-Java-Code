package allJava;
class MyNewthr1 extends Thread {
    public void run() {
        //int i = 0;

        while (true){
            // System.out.println("I am a thread");
            System.out.println("thank you");
            try {
                Thread.sleep(43);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // i++;
        }
    }
}
class MyNewthr2 extends Thread {
    public void run() {

        while (true){
            // System.out.println("I am a thread");
            System.out.println(" My thank you");
        }
    }
}
public class jev60 {
    public static void main(String[] args){
        MyNewthr1 t1 = new MyNewthr1();
        MyNewthr2 t2 = new MyNewthr2();
      /*  t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }*/
        t2.start();


    }
}
