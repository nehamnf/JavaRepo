package problems;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(isPanagram("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean isPanagram(String str)
    {
        str = str.replace(" ","");
        boolean[]  arr= new boolean[26];
        final String ALPHABET="abcdefghijklmnopqrstuvwxyz";

        for (int i=0;i<str.length();i++){
            System.out.println(str.toLowerCase().charAt(i));
            System.out.println(ALPHABET.indexOf(str.toLowerCase().charAt(i)));
            arr[ALPHABET.indexOf(str.toLowerCase().charAt(i))] = true;
        }

        for (boolean b : arr) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
