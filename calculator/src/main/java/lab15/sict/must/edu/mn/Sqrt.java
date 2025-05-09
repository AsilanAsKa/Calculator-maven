package lab15.sict.must.edu.mn;

public class Sqrt {
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot compute sqrt of negative number");
        }
        return Math.sqrt(a);
    }
}
