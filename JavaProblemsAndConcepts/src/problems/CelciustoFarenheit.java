package problems;

public class CelciustoFarenheit {
    public static void main(String[] args) {
        System.out.println(cToF(50));
    }

    public static double cToF(int C)
    {
        return ((1.8 * C) + 32);
    }
}
