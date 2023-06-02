package allJava;
class Cylinder{
    private int radius;
    private int height;
    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
      this.height = height;
    }
    public double SurfaceArea(){
        return 2* 3.14* radius + 2*3.14*radius*height;
    }
    public double Volume(){
        return 3.14 * radius * radius * height;
    }



}
public class jev40 {
    public static void main(String[] args){
        // problem no 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setheight(23);
        int h = myCylinder.getheight();
        System.out.println(h);
        // problem no 2

        myCylinder.setradius(3);
        System.out.println(myCylinder.getradius());
        System.out.println(myCylinder.SurfaceArea());
        System.out.println(myCylinder.Volume());



    }
}
