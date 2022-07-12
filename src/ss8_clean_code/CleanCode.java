package ss8_clean_code;

public class CleanCode {
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;

    /**
     *  creator: QuangNN
     * @param month
     * @param year
     * @return ... note vào đây những comment
     */
    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case 8:
            case 10:
            case 12:
                return 31;
            case APRIL:
            case JUNE:
            case 9:
            case 11:
                return 30;
            case FEBRUARY:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;// sử dụng exception sẽ học ở bài sau
        }
    }


    // Năm nhuận
    //là năm chia hết cho 4 nhưng không chia hết cho 100 hoặc chia hết cho 400
    /**
     * creator: QuangNN
     *
     * @param year: Kiểm tra xem year có phải năm nhuận hay không
     * @return: true - year là năm nhuận, false - year không phải là năm nhuận
     */
    public boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }
}
