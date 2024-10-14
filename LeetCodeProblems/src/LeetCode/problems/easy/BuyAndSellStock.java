package LeetCode.problems.easy;

public class BuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfitBetter(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {

        int maxSofar=0;
        for (int i =0; i< prices.length;i++){
            for(int j=i+1;j< prices.length;j++){
               int profit=prices[j] - prices[i];
               if( maxSofar <= profit){
                   maxSofar=profit;
               }
            }
        }
       return maxSofar;
    }
    public static int maxProfitBetter(int[] prices) {

        if( prices.length < 1){
            return 0;
        }
        int maxSofar=0;
        int minSofar=prices[0];

        for(int i=1;i< prices.length;i++){
            minSofar= Math.min(minSofar,prices[i]);
            System.out.println("minSofar: "+minSofar+" prices[i]: "+prices[i]);
            int profit= prices[i]-minSofar;
            System.out.println("profit: "+profit);
            if(maxSofar <= profit){
                maxSofar=profit;
            }
        }
        return maxSofar;
    }

}
