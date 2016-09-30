package item14;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeTest {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testInit_lessZeroHour() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Hour: -1");
        new Time(-1, 2);
    }

    @Test
    public void testInit_morePedDayHour() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Hour: 30");
        new Time(30, 2);
    }

    @Test
    public void testInit_lessZeroMinute() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Minute: -1");
        new Time(1, -1);
    }

    @Test
    public void testInit_morePerHourMinute() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Minute: 65");
        new Time(1, 65);
    }

    @Test
    public void testInit_ok() {
        new Time(1, 10);
    }

}