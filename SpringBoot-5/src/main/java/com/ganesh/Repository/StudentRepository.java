package com.ganesh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
