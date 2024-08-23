package problems;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(89,19));
    }

    public static boolean hasSharedDigit(int num1,int num2){
        if (!( num1 >= 10 && num1 <= 99) || !(num2 >= 10 && num2 <= 99)){
            System.out.println(( num1 >= 10 && num1 <= 99));
            System.out.println((num2 >= 10 && num2 <= 99));
            return false;
        }

        int rem1 = num1 % 10;
        num1 = num1 / 10;

        int rem2 = num2 % 10;
        num2 = num2 /10;

        System.out.println("rem1: "+rem1+" num 1: "+num1 +" rem 2:"+ rem2 +" num2: "+num2);
        return (num1 == rem2 || num2 == rem1 || num2 == num1 || rem1 == rem2);
    }
}
