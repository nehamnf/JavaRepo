public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2000));
    }

    public static boolean isLeapYear(int year){
        if ((year <= 1) || (year >= 9999)) {
            return false;
        }
        return ( ((year % 4 ==0) && (year % 100 != 0)) || (year % 400 ==0));
    }

    public static int getDaysInMonth(int month, int year){
        if (( (month < 1) || (month > 12)) || ((year < 1) || (year > 9999))){
            return  -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }

//        switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> {
//                return 31;
//            }
//            case 2 -> {
//                if (isLeapYear(year)) {
//                    return 29;
//                }
//                return 28;
//            }
//            default -> {
//                return 30;
//            }
//        }

//        return switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 2 -> {
//                if (isLeapYear(year)) {
//                    yield 29;
//                }
//                yield 28;
//            }
//            default -> 30;
//        };
    }
}
