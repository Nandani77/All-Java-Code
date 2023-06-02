package allJava;
class  EkClass{
    int a;
    public  int getA(){
        return a;
    }
    EkClass(int a ){
       this.a=a;// this is refrence
    }
    public int returnOne(){
      return 1;
    }
}

class DoClass extends  EkClass {
    DoClass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }

}
public class jev43 {
    public static void main(String[] args){
        EkClass e = new EkClass(75);
        DoClass d = new DoClass(54);
        System.out.println(e.getA());

    }
}
