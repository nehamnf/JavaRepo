package problems.OtherProblems;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){
        if ((year <= 1) || (year >= 9999)) {
            return false;
        }
        return ( ((year % 4 ==0) && (year % 100 != 0)) || (year % 400 ==0));
    }
}
