package problems;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{1,2,3,4}));
        System.out.println(posAverage(new int[]{92 ,2, 74, 55, 0, 10, -60, 24, 91, -67, 11}));
    }

    public static int arraySum(int[] numbers){
        int sum=0;
        for(int i =0;i < numbers.length;i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double posAverage(int[] numbers){

        double sum=0;
        double count=0;
        for (int number : numbers) {
            if (number >= 0) {
                sum = sum + number;
                count = count + 1;
            }
        }
        return sum/count;

    }
}
