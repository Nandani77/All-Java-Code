package allJava;
class Employee1{
    int salary;
    String name;
    public  int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void  setName(String n){
        name = n;
    }
}
class  Cellphone{
    public  void ring(){
        System.out.println("Ringing.....");
    }public  void vibrate(){
        System.out.println("vibrating....");
    }public void callfriend(){
        System.out.println("call nandani");
    }
}
public class jev35 {
    public static  void main(String[] args){
        Employee1 nandani = new Employee1();
        nandani.setName("HayImNandani");
        System.out.println(nandani.getName());
        nandani.salary = 80000;
        System.out.println(nandani.getSalary());

        Cellphone infinix = new Cellphone();
        infinix.callfriend();
        infinix.vibrate();
        infinix.ring();
    }
}
