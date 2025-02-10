import java.awt.Rectangle;

import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1,1));
        rectangles.add(new Rectangle(2,2));
        rectangles.add(new Rectangle(4,1));
        rectangles.add(new Rectangle(3,2));
        //not big^^, print all below
        rectangles.add(new Rectangle(3,3));
        rectangles.add(new Rectangle(5,2));
        rectangles.add(new Rectangle(2,5));
        rectangles.add(new Rectangle(6,1));
        rectangles.add(new Rectangle(4,3));
        rectangles.add(new Rectangle(6,5));

        BigRectangleFilter filter = new BigRectangleFilter();
        System.out.println("Big rectangles that have perimeter over 10:");
        for(Rectangle rect : rectangles) {
            if(filter.accept(rect)) {
                System.out.println("Width = " + rect.width + ", Height = " + rect.height + ", Perimeter = " + (rect.width + rect.width + rect.height + rect.height));
            }
        }
    }
}
