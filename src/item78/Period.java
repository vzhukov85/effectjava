package item78;

import java.io.*;
import java.util.Date;

public class Period implements Serializable {
    private final Date start;
    private final Date end;

    private static class PeriodSerializationProxy implements Serializable {
        private Date start;
        private Date end;

        public PeriodSerializationProxy(Date start, Date end) {
            this.start = start;
            this.end = end;
        }

        private Object readResolve() {
            return new Period(start, end);
        }


    }

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.after(this.end)) {
            throw new IllegalArgumentException("start date before end date");
        }
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    private Object writeResolve() {
        return new PeriodSerializationProxy(start, end);
    }

    private Object readObject(ObjectInputStream o) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }



    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
