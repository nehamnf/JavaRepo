package javaconcepts;

class Person1 {
    // Variables
    int id;
    String name;

    // Java Methods
    void set_Person(int id, String name)
    {
            this.id = id;
            this.name = name;

    }
    void disp_Person()
    {
        System.out.print(id + "\t" + name + "\t");
    }
}

// Child Class
class Employee1 extends Person1 {
    int sal;
    String design;
    void set_Emp(int id, String name, String design, int sal)
    {
            set_Person(id, name);
            this.design = design;
            this.sal = sal;

    }
    void disp_Emp()
    {
        super.disp_Person();
        System.out.println(design + "\t" + sal);
    }

    @Override
    void disp_Person()
    {
        System.out.print("from the subclass method ");
    }
}

public class InheritanceDemo {
    public static void main(String[] args)
    {

        Employee1 e1 = new Employee1();
        e1.set_Emp(1001, "nehamn", "AP", 20000);
        e1.disp_Emp();

        Person1 p1= new Employee1();
        p1.set_Person(101,"safi");
        p1.disp_Person();

    }
}
