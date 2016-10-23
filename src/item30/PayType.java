package item30;

public enum PayType {
    WEEKDAY {
        @Override
        double overtimePay(double hoursWork, double payRate) {
            return (hoursWork <= HOURS_PER_SHIFT) ? 0 :
                    (hoursWork - HOURS_PER_SHIFT) * payRate / 2;
        }
    }, WEEKEND {
        @Override
        double overtimePay(double hoursWork, double payRate) {
            return hoursWork * payRate / 2;
        }
    };

    public double pay(double hoursWork, double payRate) {
        double basePay = hoursWork * payRate;
        return basePay + overtimePay(hoursWork, payRate);
    }

    private static final int HOURS_PER_SHIFT = 8;
    abstract double overtimePay(double hoursWork, double payRate);
}
