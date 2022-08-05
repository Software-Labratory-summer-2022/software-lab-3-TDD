package rectangle;

public class Rectangle {
    public int width;
    public int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int computeArea() {
        return width * height;
    }
}
