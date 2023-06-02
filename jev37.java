package allJava;
class MyEmployee{
  private   int id;
  private   String name;
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
public class jev37 {
    public static  void main(String[] args){
        MyEmployee nandani = new MyEmployee();
       // nandani.id = 23;
      //  nandani.name = "CodeWithNandani";
        nandani.setName("CodeWithNandani");
        System.out.println(nandani.getName());
        nandani.setId(43);
        System.out.println(nandani.getId());
    }

}
