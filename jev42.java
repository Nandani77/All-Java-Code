package allJava;
class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
      //  super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x , int y){
        super(x);
        System.out.println("I am an overloaded Derived constructor with value of b as: " + y);

    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child od derived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a child off derived constructor with value of z as:" + z);
    }
}
public class jev42 {
    public static void main(String[] args){
       // Base1 b = new Base1();

        //Derived1 d = new Derived1();
       // Derived1 d = new Derived1(4 ,9);
       // ChildOfDerived cd = new ChildOfDerived(4,5,6);
        ChildOfDerived cd = new ChildOfDerived();

    }

}

