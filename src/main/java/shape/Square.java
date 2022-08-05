package shape;

public class Square extends Shape {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public int computeArea() {
        return this.side * this.side;
    }
}
