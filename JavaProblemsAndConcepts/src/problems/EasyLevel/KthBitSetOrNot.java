package problems.EasyLevel;

public class KthBitSetOrNot {
    public static void main(String[] args) {
        System.out.println(checkKthBit(8,6));
        System.out.println(isKthBitSet(3,3));
    }
    public static boolean checkKthBit(int n, int k) {
        // Your code here
        String s= Integer.toBinaryString(n);
        if (s.length() <= k){
            return false;
        }
        System.out.println(s);
        System.out.println(s.charAt(k));
        return s.charAt((s.length()-1)-k) == '1';
    }

    public static boolean isKthBitSet(int n, int k)
    {
        if ((n & (1 <<k)) != 0) {
            System.out.println("SET");
            return true;
        }
        else{
            System.out.println("NOT SET");
            return false;
         }
    }
}

