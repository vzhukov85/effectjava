package item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public void runTest(String className) throws Exception {
        int test = 0;
        int pass = 0;
        Class<?> testClass = Class.forName(className);
        for (Method m : testClass.getMethods()) {
            try {
                if (m.isAnnotationPresent(Test.class)) {
                    ++test;
                    m.invoke(null);
                    if (!m.isAnnotationPresent(ExceptionTest.class)) {
                        ++pass;
                    } else {
                        System.out.printf("Test %s failed, no exception %n", m);
                    }
                }
            } catch (InvocationTargetException e) {
                Throwable t = e.getCause();
                int oldPass = pass;
                if (m.isAnnotationPresent(ExceptionTest.class)) {
                    for(Class<? extends Exception> expType: m.getAnnotation(ExceptionTest.class).value()) {
                        if (expType.isInstance(t)) {
                            ++pass;
                            break;
                        }
                    }
                }
                if (oldPass == pass) {
                    System.out.printf("Test %s failed: %s, %n", m, t);
                }
            } catch (Exception e) {
                System.out.println("Invalid @Test: " + m);
            }
        }
        System.out.printf("Passed: %d, failed %d%n", pass, test - pass);
    }
}
