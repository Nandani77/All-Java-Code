package allJava;
class Circle{
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor.");
        this.radius = r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends Circle{
    cylinder1(int r , int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor.");
        this.height = h;

    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class jev47 {
    public static void main(String[] args){
        //Circle objc = new Circle(12);
        cylinder1 obj = new cylinder1(12,4);

    }
}
