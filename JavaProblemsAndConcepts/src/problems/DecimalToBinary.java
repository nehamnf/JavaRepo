package problems;

public class DecimalToBinary {
    public static void main(String[] args) {
        toBinary("20");
    }
    public static void toBinary(String N)
    {
        String s="";
        int n=Integer.valueOf(N);
        System.out.println(n);
        while(n > 0){
            s=(n % 2)+s;
            n= n/2;
        }
        System.out.println(s);
    }
}
