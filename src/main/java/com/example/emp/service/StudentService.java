/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.emp.service;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.emp.domain.Student;

import com.example.emp.repository.StudentRepository;
/**
 *
 * @author HP
 */
@Service
public class StudentService {
    
    @Autowired

    private StudentRepository repo;

public List<Student> listAll() {

        return repo.findAll();

    }

    

    public void save(Student std) {

        repo.save(std);

    }

    

    public Student get(long id) {

        return repo.findById(id).get();

    }

    

    public void delete(long id) {

        repo.deleteById(id);

    }
    
    
    
    
    
}
