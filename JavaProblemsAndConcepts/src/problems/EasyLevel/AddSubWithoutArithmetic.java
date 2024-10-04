package problems.EasyLevel;

public class AddSubWithoutArithmetic {
    public static void main(String[] args) {
        System.out.println(sum(30,15));
        System.out.println(sub(2,5));
    }

    public static int sum(int a , int b)
    {
       int carry=0;
       while(b!=0){
           carry= a & b;
           a= a ^ b;
           b= carry << 1;
       }
       return a;
    }

    public static int sub(int a , int b)
    {
        int borrow=0;
        while(b!=0){
            borrow= (~a) & b;
            a= a ^ b;
            b= borrow << 1;
        }
        return a;
    }
}
