package hogwarts.schoolsql.service;

import hogwarts.schoolsql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hogwarts.schoolsql.model.Student;

import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public Student findStudent(long id){
        return studentRepository.findById(id).get();
    }
    public Student editStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(long id){
        studentRepository.deleteById(id);
    }
    public Collection<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Collection<Student> findByAgeBetween(Long min, Long max){
        return studentRepository.findByAgeBetween(min, max);
    }
}

