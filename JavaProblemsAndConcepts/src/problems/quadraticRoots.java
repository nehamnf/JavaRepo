package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class quadraticRoots {
    public static void main(String[] args) {
        System.out.println(quadraticRootsFunct(752 ,904, 164));
    }

    public static ArrayList<Integer> quadraticRootsFunct(int a, int b, int c) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Double root1;
        Double root2;

        Double descriminate = (double)((b *b) - 4 * a * c);
        System.out.println(descriminate);

        if (descriminate > 0){
            root1 = Math.floor((-b + Math.sqrt(descriminate))/ (2*a));
            System.out.println(root1);
            root2 = Math.floor((-b - Math.sqrt(descriminate))/ (2*a));
            al.add(root2.intValue());
            al.add(root1.intValue());
            Collections.sort(al,Collections.reverseOrder());
            return al;
        }

        if ( descriminate == 0){
            root1 = Math.floor(-b/(2*a));
            al.add(root1.intValue());
            al.add(root1.intValue());
            return al;
        }

        if ( descriminate < 0){
            al.add(-1);
            return al;
        }
        return al;
    }
}
