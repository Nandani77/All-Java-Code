package allJava;

/*class Square{
    int side;
    public  int area(){
        return  side*side;
    }public int perimeter(){
        return 4*side;
    }
}*/
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");

    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}
public class jev36 {
    public  static void main(String[] args){
    /*    Square sq = new Square();
        sq.side = 13;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/


        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
