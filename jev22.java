package allJava;

public class jev22 {
    public static void main(String[] args){
        // Break AND continue using loop
     //   for(int i =0;i<5;i++){
       //     System.out.println(i);
         //   System.out.println("java is great");
           //if(i==2){
             //   System.out.println("Ending java is great");
               // break;
           // }
       // }
      /*  int i=8;
        while(i<5){
            System.out.println(i);
            System.out.println("java is great");
                if(i==2){
                   System.out.println("Ending java is great");
                   break;
                }
                i++;
        }
        System.out.println("loop ends here");*/
        int i=8;
        do{
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("Ending java is great");
                break;
            }
            i++;
        }while (i<5);
        System.out.println("loop ends here");

    }
}
