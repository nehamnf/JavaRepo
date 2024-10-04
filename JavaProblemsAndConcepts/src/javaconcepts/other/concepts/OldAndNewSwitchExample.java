package javaconcepts.other.concepts;

public class OldAndNewSwitchExample {
    public static void main(String[] args) {

        System.out.println(getQuarter("SEP"));
        System.out.println(getQuarterSwitchExpression("NOjV"));
    }

    public static String getQuarter(String month){

        switch(month){
            case "JAN":
            case "FEB":
            case "MAR":
                return "1st";
            case "APR":
            case "MAY":
            case "JUN":
                return "2nd";
            case "JUL":
            case "AUG":
            case "SEP":
                return "3rd";
            case "OCT":
            case "NOV":
            case "DEC":
                return "4th";
        }

        return "BAD";
    }

    //new switch expression post java 12or 14 its used
    public static String getQuarterSwitchExpression(String month){

        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st"; // yield "1st will give error so we need to use yield only in  blocks
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> month +" is bad";
        };

    }
}
