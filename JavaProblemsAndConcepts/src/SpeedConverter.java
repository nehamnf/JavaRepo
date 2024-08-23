public class SpeedConverter {
    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(75.114));
        printConversion(75.114);
    }

    public static long  toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0.0) {
            return -1;
        }
        double milesPerHours = kilometersPerHour / 1.609;
        return Math.round(milesPerHours);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0.0 ){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+ " mi/h");
        }

    }
}
