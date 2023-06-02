package allJava;

public class jev30 {
    public static void main(String[] args) {
        sub();
        sub(45, 67);
        sub(5.4f, 3.2f, 4.5f);


    }

    public static void sub() {
        int minus = 56 - 34;
        System.out.println(minus);
    }

    public static void sub(int a, int b) {
        int minus = a - b;
        System.out.println(minus);
    }

    public static void sub(float a, float b, float d) {
        float sum = a + b + d;
        System.out.println(sum);
    }
}
