package problems;

public class TheGameChallenge {
    public static void main(String[] args) {
        System.out.println(theGame(2));
    }

    public static String theGame(int n){
        if (n % 2 == 0){
            return "True";
        }
        return "False";
    }
}
