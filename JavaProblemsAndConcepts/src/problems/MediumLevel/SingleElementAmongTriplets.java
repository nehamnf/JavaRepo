package problems.MediumLevel;

public class SingleElementAmongTriplets {
    public static void main(String[] args) {
        System.out.println(getSingle(new int[]{1,3,9,1,3,1,3},7));
    }

    static int getSingle(int arr[], int n)
    {
        int ones = 0, twos = 0;
        int common_bit_mask;

        for (int i = 0; i < n; i++) {
            twos = twos | (ones & arr[i]);

            ones = ones ^ arr[i];

            common_bit_mask = ~(ones & twos);

            ones &= common_bit_mask;

            twos &= common_bit_mask;
        }
        return ones;
    }
}
