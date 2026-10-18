package ru.nartov.lab7.service;
import ru.nartov.lab7.entity.Student;import java.util.List;
public interface StudentService {List<Student> findAll();Student findById(Long id);Student save(Student student);void deleteById(Long id);}
