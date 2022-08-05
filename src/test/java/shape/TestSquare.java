package shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSquare {
    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        int area = square.computeArea();
        assertEquals(area, 25);
    }
}
