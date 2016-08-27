package item9;

public final class PhoneNumber {
    private volatile int hashCodeCash;

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int value, int max, String name) {
        if (value < 0 || value > max)
            throw new IllegalArgumentException(name + ": " + value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        return areaCode == that.areaCode && (prefix == that.prefix && lineNumber == that.lineNumber);
    }

    @Override
    public int hashCode() {
        if (hashCodeCash != 0) return hashCodeCash;
        hashCodeCash = 17;
        hashCodeCash += 31*areaCode;
        hashCodeCash += 31*prefix;
        hashCodeCash += 31*lineNumber;
        return hashCodeCash;
    }

}
