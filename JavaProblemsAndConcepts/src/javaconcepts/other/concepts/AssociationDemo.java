package javaconcepts.other.concepts;

// Person class
class Person {
    private String name;
    private Phone phone; // Association: Person has a Phone

    public Person(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}

// Phone class
class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}


public class AssociationDemo {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone");
        Person person = new Person("neha",phone);

        System.out.println(person.getPhone().getModel());
        System.out.println(person.getName() + " has a " + person.getPhone().getModel() + " phone.");
    }
}
