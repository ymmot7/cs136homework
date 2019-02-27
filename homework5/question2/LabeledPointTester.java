package homework5.question2;

public class LabeledPointTester {

    public static void main(String[] args) {
        // construct objects for three necessary points
        LabeledPoint p1 = new LabeledPoint(5, 10, "P1");
        LabeledPoint p2 = new LabeledPoint(3, 2, "P2");
        LabeledPoint p3 = new LabeledPoint(15, 13, "P3");

        // print out the 3 objects and their information
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

}
