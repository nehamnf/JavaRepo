package problems.OtherProblems;

public class IntEqualityPrinter {
    public static void main(String[] args) {
            printEqual(1,1,1);
            printEqual(2,2,3);
            printEqual(1,3,5);
    }

    public static void printEqual(int a,int b,int c){
        if ( a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        }else if ((b == c) && (c == a)){
            System.out.println("All numbers are equal");
        }else if ( ( a != b) && ( a != c) && (b != c)){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
