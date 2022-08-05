package rectangle;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestRectangle {
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 7);
        int area = rectangle.computeArea();
        assertEquals(area, 35);
    }
}
