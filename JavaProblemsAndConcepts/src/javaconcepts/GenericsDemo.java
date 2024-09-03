package javaconcepts;
// Generic class
class Pair<T, S> {
    T x;
    S y;

    public static<T> int count(T[] arr, T x)
    {
        int res = 0;

        // Traverse the array
        for(T e: arr)
        {
            if (e.equals(x))
                res++;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class GenericsDemo {

    public static void main(String[] args) {

        // Creating object of generic class
        Pair<Integer, String> p = new Pair<Integer, String>();
        //Pair<Integer, String> p = new Pair<>(); //both are correct

        // Compiles fine because
        // p being an object accepts integer
        p.x = 12;

        // Compiles fine because
        // p being an object accepts string
        p.y = "GfG";

        // This shows compiler error
        // as p.x was an integer and cannot be
        // casted to a string
//        String str = (String) p.x;

        System.out.println(p);

        Integer[] arr = new Integer[]{1,2,3,4,5,5,5,8,9};
        System.out.println(Pair.count(arr,5));
    }
}
