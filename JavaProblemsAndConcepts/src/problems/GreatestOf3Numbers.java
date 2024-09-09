package problems;

public class GreatestOf3Numbers {
    public static void main(String[] args) {
        System.out.println(find_greatest_number(10,10,4));
    }

    public static int find_greatest_number(int a, int b, int c){

       if ( (a >= b) && (a>= c)){
           return a;
       }else if ( b >= c  && b >= a){
           return b;
       }
       return c;
    }
}
