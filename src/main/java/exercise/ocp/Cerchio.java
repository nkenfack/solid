package exercise.ocp;
import java.math.*;
public class Cerchio implements Shapes {
    private final double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public  double area() {
        return this.raggio*this.raggio * 3.14;
    }
}
