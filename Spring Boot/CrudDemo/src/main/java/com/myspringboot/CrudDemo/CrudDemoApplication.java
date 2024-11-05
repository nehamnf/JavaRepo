package com.myspringboot.CrudDemo;

import com.myspringboot.CrudDemo.dao.StudentDAO;
import com.myspringboot.CrudDemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
//			createStudent(studentDAO);
//			queryStudent(studentDAO);
//			queryStudentByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteById(studentDAO);
			deleteAll(studentDAO);
		};
	}

	private static void createStudent(StudentDAO student){

		System.out.println("Creating new Student");
		Student s1= new Student("neha","mn","nehamn@gmail.com");

		System.out.println("Saving the student data");
		student.save(s1);
		System.out.println("Student saved: "+s1);

		Student s2= new Student("nishi","singh","nishi@gmail.com");
		student.save(s2);
		System.out.println("Student saved: "+s2);

		System.out.println("get student with id 2: "+student.getById(2));

	}

//	private void queryStudent(StudentDAO studentDAO){
//		List<Student> students=studentDAO.findAll();
//		for(Student s:students){
//			System.out.println(s);
//		}
//
//	}

//	private void queryStudentByLastName(StudentDAO studentDAO){
//		List<Student> students=studentDAO.findByLastName("mn");
//		for(Student s:students){
//			System.out.println(s);
//		}
//
//	}

//	private void updateStudent(StudentDAO studentDAO){
//
//		int studentId=3;
//
//		Student s= studentDAO.getById(studentId);
//		System.out.println("Before update : "+s);
//
//		s.setLastName("Farheen");
//		studentDAO.update(s);
//
//		System.out.println("Student updated: "+s);
//	}

	private void deleteById(StudentDAO studentDAO){
		studentDAO.delete(4);
	}

	private void deleteAll(StudentDAO studentDAO){
		System.out.println("Deleting all Students: ");
		System.out.println(studentDAO.deleteAll());
	}
}
