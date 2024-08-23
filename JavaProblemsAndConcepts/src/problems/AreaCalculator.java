package problems;

import javaconcepts.testPackage;

public class AreaCalculator extends testPackage{

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));
        testPackage  tp= new testPackage();
        tp.testMethod();
        //new problems.AreaCalculator().testMethod();
    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        return (Math.PI *  radius * radius);
    }

    public static double area(double x, double y){
        if ( x < 0 || y <0){
            return -1;
        }
        return x * y;
    }
}
