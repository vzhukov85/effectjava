package item8;

public class PointLiskovBroken {
    private final int x;
    private final int y;

    public PointLiskovBroken(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        PointLiskovBroken p = (PointLiskovBroken) o;
        return x == p.x && y == p.y;
    }
}
