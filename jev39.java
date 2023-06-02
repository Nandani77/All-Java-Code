package allJava;
class MyMainEmployee{
    private   int id;
    private   String name;
    public MyMainEmployee(){
        id = 32;
        name = "your-name-is-here";
    }
    public MyMainEmployee(String myName, int  myid){
        id = myid;
        name = myName;
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class jev39 {
    public static  void main(String[] args){
        MyMainEmployee nandani = new MyMainEmployee("CodeWithNandani" ,34);
        //  nandani.setName("CodeWithNandani");
       // nandani.setId(43);
        System.out.println(nandani.getId());
        System.out.println(nandani.getName());
    }
}
