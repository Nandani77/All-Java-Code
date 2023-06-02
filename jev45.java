package allJava;
class One{
       public void name(){
        System.out.println("My name is Nandani");
        }
        public void greet(){
            System.out.println("Morning");
        }
}

class Two extends One{
    public void swagat(){
        System.out.println("Your welcome!!");
    }
    public void name(){
        System.out.println("My name is nandani in class two.");
    }
}
public class jev45 {
    public static void main(String[] args){
     /*   One obj = new One();
        Two smobj = new Two();
        obj.name();*/
        // dynamic methods dispatched
        One obj = new Two();// yes it is allowed
        // Two obj = new One();  not allowed
        obj.greet();
        obj.name();

    }
}
