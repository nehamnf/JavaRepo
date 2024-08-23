package javaconcepts;

class StudentPojo {
    private String id;
    private String name;
    private String dob;
    private String classList;

    public StudentPojo(String id, String name, String dob, String classList) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classList = classList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getClassList() {
        return classList;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}

public class PojoDemo{
    public static void main(String[] args) {

        for (int i =1; i <= 5;i++){
            StudentPojo s = new StudentPojo("1000"+i,
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

        System.out.println();
    }
}
