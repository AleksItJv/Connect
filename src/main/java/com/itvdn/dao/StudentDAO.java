package com.itvdn.dao;

import com.itvdn.models.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> getAll();
    Student getId(int id);
    void save(Student student);
}
