package com.myspringboot.CrudDemo.dao;

import com.myspringboot.CrudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student getById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
