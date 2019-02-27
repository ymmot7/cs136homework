package homework5.question2;
import java.awt.Point;

public class LabeledPoint extends Point {
    int x;
    int y;
    String label;

    public LabeledPoint(int x, int y, String label) {   // use super to access constructor of superclass
        super(x, y);
        this.label = label;     // create variables to be used in toString method
        this.x = x;
        this.y = y;
    }

    public String toString() {
        super.toString();   // use the toString method of the LabeledPoint superclass

        return label + ": (" + x + ", " + y + ")";  // return the improved label point

    }
}
