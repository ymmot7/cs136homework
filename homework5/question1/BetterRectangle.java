package homework5.question1;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        setLocation(x, y);  // initialize the rectangle to a specific x, y coordinate
        setSize(width, height); // set the size of the rectangle after the location is chosen
    }

    public double getPerimeter() {
        return getHeight() * 2 + getWidth() * 2;    // use the methods getHeight and getWidth to calculate perimeter
    }

    public double getArea() {
        return getHeight() * getWidth();    // use getHeight and getWidth to calculate area
    }
}
