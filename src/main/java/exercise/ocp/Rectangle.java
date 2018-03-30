package exercise.ocp;
import java.util.*;
public class Rectangle implements Shapes {

    private final double height;
    private final double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return this.width;
    }

    public static void setHeight(double height){
        this.height=height ;
    }
    public static void setWidth(double width){
        this.width=width;
    }
    public  void  resize( double height, double width){
        this.getHeight();
        this.getWidth();
    }

    @Override
    public Static double area(){
        return this.height*this.width;
    }
}
