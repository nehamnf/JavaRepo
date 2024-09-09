package problems;

public class PrintCharAtEvenIndexes {
    public static void main(String[] args) {
            utility("DoctorPhenomenal");
    }
    public static void utility(String s){

        for (int i =0; i < s.length();i++) {
            if ( i % 2 ==0){
                System.out.print(s.charAt(i));
            }
        }
    }
}