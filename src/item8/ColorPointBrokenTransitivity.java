package item8;


import java.awt.*;

public class ColorPointBrokenTransitivity extends Point {
    private final Color color;

    public ColorPointBrokenTransitivity(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Point))
            return false;
        if (! (o instanceof ColorPointBrokenTransitivity))
            return o.equals(this);
        return super.equals(o) && ((ColorPointBrokenTransitivity) o).color == color;
    }
}
