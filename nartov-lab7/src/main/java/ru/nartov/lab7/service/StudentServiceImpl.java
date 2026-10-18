package ru.nartov.lab7.service;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;
import ru.nartov.lab7.entity.Student;import ru.nartov.lab7.repository.StudentRepository;import java.util.List;
@Service @Transactional public class StudentServiceImpl implements StudentService {
 private final StudentRepository repository;public StudentServiceImpl(StudentRepository repository){this.repository=repository;}
 @Transactional(readOnly=true) public List<Student> findAll(){return repository.findAll();}
 @Transactional(readOnly=true) public Student findById(Long id){return repository.findById(id).orElseThrow(()->new IllegalArgumentException("Студент с id="+id+" не найден"));}
 public Student save(Student student){return repository.save(student);}
 public void deleteById(Long id){if(!repository.existsById(id))throw new IllegalArgumentException("Студент с id="+id+" не найден");repository.deleteById(id);}
}
