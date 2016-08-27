package item8;

import java.awt.*;

public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof ColorPoint))
            return false;
        ColorPoint colorPoint = (ColorPoint) o;
        return color.equals(colorPoint.color) && point.equals(colorPoint.point);
    }

}
