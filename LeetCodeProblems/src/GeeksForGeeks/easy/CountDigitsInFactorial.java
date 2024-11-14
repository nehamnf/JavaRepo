package GeeksForGeeks.easy;

public class CountDigitsInFactorial {

    public static void main(String[] args) {
        double sum=0.0;
        for(int i=1;i<= 120;i++){
            sum=Math.log10(i)+sum;
            System.out.println(Math.log10(i));
        }

        System.out.println(Math.floor(sum) +1.0);
    }
}
