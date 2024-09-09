package problems;

public class InvertedTriangle {
    public static void main(String[] args) {
            invTriangleWall(5);
    }

    public static void invTriangleWall(int s){
        for (int i=s; i > 0;i--){
            for(int j=i; j > 0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
