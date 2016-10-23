package item30;

public enum PayrollDayBad {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    private static final int HOURS_PER_SHIFT = 8;

    public double pay(double hoursWorked, double payRated) {
        double overtimePay;
        double basePay = hoursWorked*payRated;
        switch(this) {
            case SATURDAY:
            case SUNDAY:
                overtimePay = hoursWorked*payRated/2;
                break;
            default:
                overtimePay = (hoursWorked <= HOURS_PER_SHIFT) ? 0 :
                        (hoursWorked - HOURS_PER_SHIFT) * payRated / 2;
        }
        return basePay + overtimePay;
    }
}
