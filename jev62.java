package allJava;
class Practics13 extends Thread {
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning!!");

        }
    }
}
class Practics14 extends Thread {
    public void run() {
     /*   while (false){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }*/
            System.out.println("Welcome");
        }
    }
//}
public class jev62 {
    public static void main(String[] args){
        Practics13 p1 = new Practics13();
     //   p1.setPriority(6);
        Practics14 p2 = new Practics14();
       // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
      //  p1.start();
       p2.start();

    }
}
