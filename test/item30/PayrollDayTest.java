package item30;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;


public class PayrollDayTest {

    @Test
    public void testPay() throws Exception {
        assertThat(PayrollDay.FRIDAY.pay(9, 10), Matchers.equalTo(95.));
        assertThat(PayrollDay.SUNDAY.pay(9, 10), Matchers.equalTo(135.));
        assertThat(PayrollDay.SATURDAY.pay(9, 10), Matchers.equalTo(135.));
    }
}