package item76;

import java.io.*;
import java.util.Date;

public class Period implements Serializable {
    private Date start;
    private Date end;

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

    private void readObject(ObjectOutputStream s) throws IOException, ClassNotFoundException {
        s.defaultWriteObject();

        start = new Date(start.getTime());
        end = new Date(end.getTime());
        if (this.start.after(this.end)) {
            throw new InvalidObjectException(start + " after " + end);
        }
    }



    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
