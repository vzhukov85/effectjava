package item8;


import java.awt.*;

public class ColorPointBrokenSymmetry extends Point {
    private final Color color;

    public ColorPointBrokenSymmetry(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof ColorPointBrokenSymmetry))
            return false;
        return super.equals(o) && ((ColorPointBrokenSymmetry) o).color == color;
    }
}
