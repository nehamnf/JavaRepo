package problems.OtherProblems;

public class PrintSquare {
    public static void main(String[] args) {
        square(7);
        squareWall(7);
    }

    public static void square(int s) {
        for (int i=1;i <= s;i++) {
            for (int j =1 ;j <=s;j++){
            if ( i == 1 || (i ==s)) {
                System.out.print("* ");
            }
            else if ((j ==1)) {
                System.out.print("* ");
            }else if( j != s){
                System.out.print("  ");
            }
            else if (j==s){
                System.out.print("*");
            }
           }
            System.out.println();
        }
    }

    public static void squareWall(int s){
        for(int i=1 ;i <=s ;i++){
            for(int j=1;j<=s;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
