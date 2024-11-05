package com.myspringboot.CrudDemo.dao;

import com.myspringboot.CrudDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Transactional
    @Override
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student getById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery=entityManager.createQuery("FROM Student",Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        TypedQuery<Student> typedQuery=entityManager.createQuery("FROM Student where lastName=:theData",Student.class);
        typedQuery.setParameter("theData",theLastName);
        return typedQuery.getResultList();
    }

    @Transactional
    @Override
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
     Student s= entityManager.find(Student.class,id);

     entityManager.remove(s);
    }

    @Transactional
    @Override
    public int deleteAll() {
        int rowSdeleted=entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return rowSdeleted;
    }
}
