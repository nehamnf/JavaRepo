package Other;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(leapYear(2200));
    }

    public static int leapYear(int num){

        if((num % 400 == 0) || (num % 100 != 0) && (num % 4 != 0)){
            return 1;
        }
        return 0;
    }
}
