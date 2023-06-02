package allJava;

public class jev25 {
    public static void main(String[] args){
        int[] marks = {98, 45, 79, 99, 88};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // Displaying the Array (for loop)
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int i=marks.length -1;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //Displaying the Array (for loop)
        System.out.println("printing using java in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        for(int element: marks){
            System.out.println(element);
        }








    }
}
