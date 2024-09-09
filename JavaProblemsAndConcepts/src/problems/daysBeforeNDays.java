package problems;

public class daysBeforeNDays {
    public static void main(String[] args) {
        utility(3,9);
    }
    public static void utility(int d, int n){
       int rem = n % 7;
       if ( d - rem < 0){
           System.out.println((d-rem + 7));
       }else {
           System.out.println(d-rem);
       }

    }
}
