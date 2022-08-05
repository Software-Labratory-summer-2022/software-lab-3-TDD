package shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestRectangle {
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 7);
        int area = rectangle.computeArea();
        assertEquals(area, 35);
    }

    @Test
    public void testRectangleSetters() {
        Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(rectangle.computeArea(), 1);
        rectangle.setWidth(10);
        rectangle.setHeight(9);
        assertEquals(rectangle.computeArea(), 90);
    }
}
