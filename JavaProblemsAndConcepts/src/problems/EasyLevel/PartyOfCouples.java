package problems.EasyLevel;

public class PartyOfCouples {
    public static void main(String[] args) {
        System.out.println(findSingle(11,new int[]{1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6}));
    }
    static int findSingle(int n, int arr[]){
        // code here
        if (n==1){
            return arr[0];
        }

        int value=arr[0];
        for (int i=1;i<n;i++) {
            value = value ^ arr[i];
        }
        return value;
    }
}
