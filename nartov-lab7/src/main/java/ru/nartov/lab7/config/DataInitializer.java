package ru.nartov.lab7.config;
import org.springframework.boot.CommandLineRunner;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;
import ru.nartov.lab7.entity.Student;import ru.nartov.lab7.entity.StudyGroup;import ru.nartov.lab7.repository.StudentRepository;import ru.nartov.lab7.repository.StudyGroupRepository;
@Configuration public class DataInitializer {
 @Bean CommandLineRunner initialize(StudentRepository students,StudyGroupRepository groups){return args->{if(students.count()==0){students.save(new Student("Иван","Иванов","РТФ",20));students.save(new Student("Анна","Петрова","ИРИТ-РТФ",21));}if(groups.count()==0){groups.save(new StudyGroup("РИТМ-21","Информационные системы",3,"Иванова Ирина Сергеевна"));groups.save(new StudyGroup("РТФ-22","Радиотехника",2,"Петров Алексей Иванович"));}};}
}
