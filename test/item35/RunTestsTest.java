package item35;

import org.junit.*;

import static org.junit.Assert.*;

public class RunTestsTest {

    @org.junit.Test
    public void testRunTest() throws Exception {
        RunTests runner = new RunTests();
        runner.runTest("item35.Sample");
        runner.runTest("item35.Sample2");
    }
}