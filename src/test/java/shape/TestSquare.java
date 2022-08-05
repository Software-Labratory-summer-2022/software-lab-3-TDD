package shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSquare {
    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        int area = square.computeArea();
        assertEquals(25, area);
    }

    @Test
    public void testSquareSetter() {
        Square square = new Square(5);
        square.setSide(6);
        int area = square.computeArea();
        assertEquals(36, area);

    }

}
