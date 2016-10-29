package item39;

import java.util.Date;

public class Period {

    private final Date startDate;
    private final Date endDate;

    public Period(Date startDate, Date endDate) {
        this.startDate = new Date(startDate.getTime());
        this.endDate = new Date(endDate.getTime());
        if (this.startDate.after(this.endDate)) throw new IllegalArgumentException("Start date after end date");
    }

    public Date getStartDate() {
        return (Date) startDate.clone();
    }

    public Date getEndDate() {
        return (Date) endDate.clone();
    }
}
