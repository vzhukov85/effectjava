package item8;

public class NotOverrideEqual {

    @Override
    public boolean equals(Object obj) {
        throw new AssertionError();
    }
}
