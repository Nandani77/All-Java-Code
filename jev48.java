package allJava;
abstract class Parent2{
    public Parent2(){
        System.out.println("i am s constructor of Base2 class");
    }
    public  void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
 abstract class child3 extends Parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class jev48 {
    public static void main(String[] args){
        // abstract class
        child2 c = new child2();
    }
}
