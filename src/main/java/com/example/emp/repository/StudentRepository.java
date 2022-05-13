/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.emp.domain.Student;
/**
 *
 * @author HP
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
    
    
}
