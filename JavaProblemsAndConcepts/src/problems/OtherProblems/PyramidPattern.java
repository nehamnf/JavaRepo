package problems.OtherProblems;

public class PyramidPattern {
    public static void main(String[] args) {
        printPyramid(4);
    }

    public static void printPyramid(int n){
        for (int i=1;i <=n;i++){
                    System.out.print(" ".repeat(n-i)+"* ".repeat(((2*i)-1)));
            }
            System.out.println();
        }
}
