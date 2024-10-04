package javaconcepts.other.concepts;

record PESStudent(String id, String name, String dob, String classList) {

}

public class PojoDemo2{
    public static void main(String[] args) {
        for (int i =1; i <= 5;i++){
            PESStudent s = new PESStudent("1000"+i,
                    switch (i){
                        case 1 -> "neha";
                        case 2 -> "safi";
                        case 3 -> "damon";
                        case 4 -> " james";
                        case 5 -> "lily";
                        default -> "Anonymous";
                    },
                    "20/07/1997",
                    "A"
            );
            System.out.println(s);
        }

        StudentPojo studentPojo = new StudentPojo("123","neha","20/07/1997","A");
        System.out.println(studentPojo);
        System.out.println(studentPojo.getName());
        studentPojo.setName("Nehafarheen");
        System.out.println(studentPojo.getName());
        PESStudent recordPojo = new PESStudent("789","mn","20/07/1997","B");
        System.out.println(recordPojo);
        System.out.println(recordPojo.name());
    }
}


