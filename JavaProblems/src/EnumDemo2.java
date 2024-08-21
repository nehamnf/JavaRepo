// An Enum class
enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumDemo2 {
    Days day;
    // Constructor
    public EnumDemo2(Days day) {
        this.day = day;
    }

    // Prints a line about Day using switch
    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    // Driver method
    public static void main(String[] args) {
        String str = "MONDAY";
        EnumDemo2 t1 = new EnumDemo2(Days.valueOf(str));
        System.out.println(Days.valueOf(str));
        t1.dayIsLike();
    }
}
