package javaconcepts;

import java.util.ArrayList;
import java.util.List;

// Professor class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;
    private List<Professor> professors; // Department "has a" list of Professors

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listProfessors() {
        System.out.println("Professors in " + name + " Department:");
        if (professors.isEmpty()){
            System.out.println("No professors associated with the DEPARTMENT");
            return;
        }
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }
}


public class AggregationDemo {
    public static void main(String[] args) {
        // Create Professor instances
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Jones");

        // Create Department instances
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        dept1.listProfessors();
        // Add Professors to Departments
        dept1.addProfessor(prof1);
        dept1.addProfessor(prof2);
        dept2.addProfessor(prof2); // Professor can be part of multiple departments

        // Display Professors in each Department
        dept1.listProfessors();
        dept2.listProfessors();
    }
}
