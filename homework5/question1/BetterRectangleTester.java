package homework5.question1;

public class BetterRectangleTester {
    public static void main(String[] args) {
        // construct 3 different rectangles
        BetterRectangle betterRectangleTest1 = new BetterRectangle(4, 5, 20, 4);
        BetterRectangle betterRectangleTest2 = new BetterRectangle(1, 2, 5, 7);
        BetterRectangle betterRectangleTest3 = new BetterRectangle(10, 20, 50, 30);

        // print out the necessary information about the 3 rectangles
        System.out.println("Rectangle 1\nPerimeter: " + betterRectangleTest1.getPerimeter() + "\nArea: "
                + betterRectangleTest1.getArea());

        System.out.println();

        System.out.println("Rectangle 2\nPerimeter: " + betterRectangleTest2.getPerimeter() + "\nArea: "
                + betterRectangleTest2.getArea());

        System.out.println();

        System.out.println("Rectangle 3\nPerimeter: " + betterRectangleTest3.getPerimeter() + "\nArea: "
                + betterRectangleTest3.getArea());
    }
}
