package allJava;

class Employe{
    int id;
    int Salary;
    String name;
    public void printDetails(){
        System.out.println("my id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return Salary;

    }
}
public class jev34 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employe nandani = new Employe();
        Employe john = new Employe();
        nandani.id = 12;
        nandani.name = "CodeWithnandani";
        nandani.Salary = 32000;
        john.id = 32;
        john.name = "johnFamily";
        john.Salary = 43000;
        nandani.printDetails();;
        john.printDetails();
        int Salary = john.getSalary();
        System.out.println(Salary);

    }
}
