package javaconcepts.other.concepts;


public class Formatting {
    public static void main(String[] args) {
        int i=10000;
        //System.out.printf("%.d%n",a);
        System.out.printf("%,d\n",i);
        System.out.format("%6d\n",i);

        // declaring double
        double a = 3.14159265359;
        // Printing Double Value with
        // different javaconcepts.Formatting
        System.out.printf("%f\n", a);
        System.out.printf("%5.3f\n", a);
        System.out.printf("%5.2f\n", a);

        int aa = 10;
        Boolean b = true, c = false;
        Integer d = null;
        //javaconcepts.Formatting Done using printf
        System.out.printf("%b\n", aa);
        System.out.printf("%B\n", b);
        System.out.printf("%b\n", c);
        System.out.printf("%d\n", d);

        char cc = 'g';
        // javaconcepts.Formatting Done
        System.out.printf("%c\n", cc);
        // Converting into Uppercase
        System.out.printf("%C\n", cc);

        String str = "geeks";
        // javaconcepts.Formatting from lowercase to
        // Uppercase
        System.out.printf("%s \n", str);
        System.out.printf("%S \n", str);
        str = "GFG";
        // Vice-versa not possible
        System.out.printf("%S \n", str);
        System.out.printf("%s \n", str);


    }
}
