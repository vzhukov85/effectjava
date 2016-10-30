package item48;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceCalcTest {

    @Test
    public void testCandyDouble() throws Exception {
        FinanceCalc.candyDouble();
    }

    @Test
    public void testCandyInt() throws Exception {
        FinanceCalc.candyInt();
    }

    @Test
    public void testCandyBigDecimal() throws Exception {
        FinanceCalc.candyBigDecimal();
    }
}