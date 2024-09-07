package problems;

//microsoft
public class StringComparison {

    private static final String PRIORITY_ORDER = "abcdefghijklmnngopqrstuvwxyz";

    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        System.out.println("len1: "+len1);
        int len2 = s2.length();
        System.out.println("len2: "+len2);
        int minLength = Math.min(len1, len2);


        int i = 0;
        while (i < minLength) {

            String sub1 = getPrioritySubstring(s1, i);
            System.out.println("sub1: "+sub1);
            String sub2 = getPrioritySubstring(s2, i);
            System.out.println("sub2: "+sub2);
            int priority1 = PRIORITY_ORDER.indexOf(sub1);
            System.out.println("p1: "+priority1);
            int priority2 = PRIORITY_ORDER.indexOf(sub2);
            System.out.println("p2: "+priority2);

            if (priority1 < priority2) {
                return -1;
            } else if (priority1 > priority2) {
                return 1;
            }

            i += sub1.length();
            System.out.println("i: "+i);
        }

        return Integer.compare(len1, len2);
    }

    private static String getPrioritySubstring(String s, int start) {

        if (start + 1 < s.length() && s.charAt(start) == 'n' && s.charAt(start + 1) == 'g') {
            return "ng";
        }

        if (s.charAt(start) == 'n') {
            return "n";
        }

        return String.valueOf(s.charAt(start));
    }

    public static void main(String[] args) {

        System.out.println(compareStrings("wnlhg", "wng"));
    }
}
