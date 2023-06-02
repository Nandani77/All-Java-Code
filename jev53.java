package allJava;
abstract class pen{
   abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill( ){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("changing the nib");
    }
}
class  Monkey{
    void jump(){
        System.out.println("jumping.....");
    }
    void bite(){
        System.out.println("biting..");
    }
}
interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir!");
    }
    public void eat(){
        System.out.println("eating..");
    }
    public void sleep(){
        System.out.println("sleeping..");
    }
}
public class jev53 {
    public static void main(String[] args){
        FountainPen pen = new FountainPen();
        pen.changeNib();

        Human nandani = new Human();
        nandani.eat();
        nandani.sleep();
        nandani.speak();
        nandani.bite();
        nandani.jump();
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();




    }
}
