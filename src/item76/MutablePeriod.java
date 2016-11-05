package item76;


import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import item39.*;

import java.io.*;
import java.util.Date;

public class MutablePeriod {

    private final Period period;
    private final Date start;
    private final Date end;

    public MutablePeriod() {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(new Period(new Date(), new Date()));
            byte[] ref = { 0x71, 0, 0x7e, 0, 5 };
            oos.write(ref);
            ref[4] = 4;
            oos.write(ref);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
            period = (Period) ois.readObject();
            start = (Date) ois.readObject();
            end = (Date) ois.readObject();
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        MutablePeriod mPeriod = new MutablePeriod();
        mPeriod.start.setYear(2014);
        System.out.println(mPeriod.period);
        mPeriod.end.setYear(2015);
        System.out.println(mPeriod.period);
    }
}
