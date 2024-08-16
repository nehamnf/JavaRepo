import java.util.Scanner;

public class IOFunction {
    public static void main(String[] args) {
        IOFunction1();
    }
    static void IOFunction1() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a =sc.nextInt();
            float f= sc.nextFloat();
            long l= sc.nextLong();
            byte b= sc.nextByte();
            sc.nextLine();
            String s= sc.nextLine();
            System.out.println(a);
            System.out.println(f);
            System.out.println(l);
            System.out.println(b);
            System.out.println(s);
        }
    }
}
