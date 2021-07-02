package com.itvdn.controllers;

import com.itvdn.dao.StudentDAOImpl;
import com.itvdn.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentsController {

    private final StudentDAOImpl studentDAOImpl;

    @Autowired
    public StudentsController(StudentDAOImpl studentDAOImpl){
        this.studentDAOImpl = studentDAOImpl;
    }

    @GetMapping()
    public String getAll(Model model){
        model.addAttribute("students", studentDAOImpl.getAll());
        return "students/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("student", studentDAOImpl.getId(id));
        return "students/show";
    }

    @GetMapping("/new")
    public String newStudent(Model model){
        model.addAttribute("student", new Student());
        return "students/new";
    }

    @PostMapping
    public String create(@ModelAttribute("student") Student student){
        studentDAOImpl.save(student);
        return "redirect:/students";
    }

}
