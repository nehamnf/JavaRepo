package problems.OtherProblems;

public class facingSun {
    public static void main(String[] args) {
        System.out.println(countBuildings(new int[]{2,5,1,5}));
    }

    public static int countBuildings(int[] height) {
        // code here

        if (height.length == 1){
            return 1;
        }
        int canSee=1;
        int building=height[0];
        for(int i=1;i< height.length;i++){
            System.out.println("height: "+height[i]);
            if (height[i] > building){
                canSee=canSee+1;
                building=height[i];
                System.out.println("---"+canSee);
            }
        }
        return canSee;
    }
}
