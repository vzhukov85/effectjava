package item8;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
    }
}
