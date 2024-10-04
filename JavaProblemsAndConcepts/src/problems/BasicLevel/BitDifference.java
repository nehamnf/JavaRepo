package problems.BasicLevel;

public class BitDifference {
    public static void main(String[] args) {
        System.out.println(countBitsFlip(20,25));
    }

    public static int countBitsFlip(int a, int b){

        // Your code here
        int flippedBits= a ^b;int msb=0;
        int count=0;
        while( flippedBits > 0){
            msb= flippedBits & 1;
            if ( msb ==1){
                count=count+1;

            }
            flippedBits = flippedBits >> 1;
        }
            return count;
    }

}
