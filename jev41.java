package allJava;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");

    }
}
class  Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class jev41 {
    public static void main(String[] args){
       // Base b = new Base();
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());


    }
}
