package allJava;

public class Rectangle {
    public float length;
    public float breadth;
    public float getArea(){
       float area = length * breadth;
       return area;
    }
    public float getPerimeter(){
      float perimeter = 2 * ( length + breadth);
      return perimeter;
    }
}
