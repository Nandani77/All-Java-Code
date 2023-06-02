package allJava;

public class jev14 {
    public static void main(String[] args){
       // String name = "Raj Nandani";
      //  name = name.toLowerCase();
      //  System.out.println(name);

       // String text = "To lower case";
     //   text = text.replace("","-");
      //  System.out.println(text);

        String letter = "Dear <|name|>,Thanks a lot!";
        letter.replace("<|name|","NAndani");
        System.out.println(letter);

    }
}
