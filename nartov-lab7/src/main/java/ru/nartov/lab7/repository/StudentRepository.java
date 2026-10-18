package ru.nartov.lab7.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.nartov.lab7.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Long> {}
