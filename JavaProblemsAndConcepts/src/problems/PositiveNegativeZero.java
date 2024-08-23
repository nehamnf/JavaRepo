package problems;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(-8);
    }

    public static void checkNumber(int number){
        String result = (number > 0) ? "positive" : (number == 0) ? "zero" : "negative";
        System.out.println(result);
    }


}
