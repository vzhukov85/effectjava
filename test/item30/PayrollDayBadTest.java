package item30;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PayrollDayBadTest {

    @Test
    public void testPay() throws Exception {
        assertThat(PayrollDayBad.FRIDAY.pay(9, 10), Matchers.equalTo(95.));
        assertThat(PayrollDayBad.SUNDAY.pay(9, 10), Matchers.equalTo(135.));
        assertThat(PayrollDayBad.SATURDAY.pay(9, 10), Matchers.equalTo(135.));
    }
}