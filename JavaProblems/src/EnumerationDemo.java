enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumerationDemo {
    public class Test {
        enum Color {
            RED,
            GREEN,
            BLUE;
            }
          public void printHello(){
              System.out.println("hello");
          }
        }
        // Driver method
        public static void main(String[] args) {
            EnumerationDemo enum1 = new EnumerationDemo();
            EnumerationDemo.Test t= enum1.new Test();
            Test.Color c1 = Test.Color.RED;
            System.out.println(c1);
            t.printHello();

            Day day = Day.MONDAY;
            System.out.println(day);

            for( Day dayVal : Day.values()){
                System.out.println(dayVal);
            }
        }

}


