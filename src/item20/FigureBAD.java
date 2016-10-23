package item20;


public class FigureBAD {
    enum Shape {CIRCLE, RECTANGLE}

    private int radius;
    private int width;
    private int height;

    private Shape type;
    public FigureBAD(int radius) {
        this.radius = radius;
        this.type =Shape.CIRCLE;
    }

    public FigureBAD(int width, int height) {
        this.width = width;
        this.height = height;
        this.type = Shape.RECTANGLE;
    }

    public double area() {
        switch(type) {
            case CIRCLE:
                return Math.PI*Math.pow(radius, 2);
            case RECTANGLE:
                return width*height;
            default:
                throw new AssertionError();
        }
    }


}
