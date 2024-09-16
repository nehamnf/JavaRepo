package problems;

public class DigitsAfterDecimalPlaces {
    public static void main(String[] args) {
        digitsAfterDecimal(123.7349);
    }

    public static void digitsAfterDecimal(double d){
        String str= String.valueOf(d);
        System.out.println(str.substring(str.indexOf(".")+1));
    }
}
