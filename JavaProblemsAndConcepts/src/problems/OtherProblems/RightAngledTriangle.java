package problems.OtherProblems;

public class RightAngledTriangle {
    public static void main(String[] args) {
            triangleWall(9);
        triangleWallWithSpaces(5);
    }
    public static void triangleWall(int s){
        for (int i=1;i <= s;i++){
            for (int j=1;j <=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//        *
//        *--*
//        *----*
//        *------*
//        *        *
//        *          *
//        *            *
//        *              *
//        * * * * * * * * *

    public static void triangleWallWithSpaces(int s){
        for (int i=1;i <= s;i++){
            for (int j=1;j <=i;j++){
                if ( !(i ==s) && (j != 1 && j != i)){
                    System.out.print("  ");
                }else if ( i ==s){
                    System.out.print("* ");
                }else if (j ==1){
                    System.out.print("*  ");
                }else if (j == i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        String b ="*";
        String space =" ";
        for (int i=1;i <= s;i++){
            for (int j=1;j <=i;j++){
                if ((j == 1) ) {
                    System.out.print(b);
                }else if ( i == s) {
                    System.out.printf(" %s",b);
                }else if (j==i){
                    System.out.printf("%s%s",space.repeat(j),b);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
