package javaconcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOFunction {
    public static void main(String[] args) throws IOException {
        IOFunction1();
    }
    static void IOFunction1() throws  IOException {
        System.out.println("Taking input using scanner:");
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

        System.out.println("Taking input using BufferedReader:");
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        float f= Float.parseFloat(br.readLine());
        long l = Long.parseLong(br.readLine());
        byte b = Byte.parseByte(br.readLine());
        String s= br.readLine();
        System.out.println(a);
        System.out.println(f);
        System.out.println(l);
        System.out.println(b);
        System.out.println(s);
    }
}
