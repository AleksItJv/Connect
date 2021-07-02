package com.itvdn.dao;

import com.itvdn.connection.HibernateUtil;
import com.itvdn.models.Student;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDAOImpl implements StudentDAO {

/*    private static int STUDENT_COUNT;
    private List<Student> students;*/

/*    {
        students = new ArrayList<>();

        students.add(new Student(++STUDENT_COUNT, "Eva"));
        students.add(new Student(++STUDENT_COUNT, "Martin"));
        students.add(new Student(++STUDENT_COUNT, "Oleg"));
        students.add(new Student(++STUDENT_COUNT, "Lena"));
    }*/

    public List<Student> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<Student> students = session.createQuery("from Student").list();

        session.getTransaction().commit();
        session.close();
        return students;
    }

    public Student getId(int id){
        //return students.stream().filter(student -> student.getId() == id).findAny().orElse(null);
        Session session = HibernateUtil.getSessionFactory().openSession();

        Student student = (Student) session.get(Student.class, id);

        session.close();
        return student;
    }

    public void save(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
}
