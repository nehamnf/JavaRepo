package problems;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9));
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return  -1;
        }
        String s = String.valueOf(number);
        if (s.length() == 1){
            return Integer.parseInt(s) * 2;
        }

        int i = Integer.parseInt(s.substring(0, s.length() - (s.length() - 1))) + Integer.parseInt(s.substring(s.length() - 1));
        System.out.println(Integer.parseInt(s.substring(0,1)));
        return i;
    }
}
