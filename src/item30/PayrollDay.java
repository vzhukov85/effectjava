package item30;

public enum PayrollDay {

    MONDAY(PayType.WEEKDAY), //
    TUESDAY(PayType.WEEKDAY),  //
    WEDNESDAY(PayType.WEEKDAY), //
    THURSDAY(PayType.WEEKDAY), //
    FRIDAY(PayType.WEEKDAY), //
    SATURDAY(PayType.WEEKEND), //
    SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    public double pay(double hoursWork, double payRate) {
        return payType.pay(hoursWork, payRate);
    }
}
