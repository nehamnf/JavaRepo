package problems;

public class CountDigits {
    public static void main(String[] args) {
        int x=12345;
        int i;
        for (i=1;x > 0;i++){
            x= x /10;
        }
        System.out.println(i-1);
    }
}
