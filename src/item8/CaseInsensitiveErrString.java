package item8;

public final class CaseInsensitiveErrString {
    private final String s;
    public CaseInsensitiveErrString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveErrString) {
            return s.equalsIgnoreCase(((CaseInsensitiveErrString) o).s);
        }
        return o instanceof String && s.equalsIgnoreCase((String) o);
    }
}
