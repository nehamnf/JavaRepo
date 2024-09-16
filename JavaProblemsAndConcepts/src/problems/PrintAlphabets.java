package problems;

public class PrintAlphabets {
    public static void main(String[] args) {
        alphabets('a','z');
    }

    public static void alphabets(char c1, char c2){
        // code here
        for(int i=c1;i <=c2;i++){
            System.out.printf("%c ",i);
        }
    }
}
