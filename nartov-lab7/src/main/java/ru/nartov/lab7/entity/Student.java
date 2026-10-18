package ru.nartov.lab7.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="STUDENTS")
public class Student {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @NotBlank(message="Введите имя") @Size(max=15,message="Имя — не более 15 символов") @Column(length=15,nullable=false) private String name;
    @NotBlank(message="Введите фамилию") @Size(max=25,message="Фамилия — не более 25 символов") @Column(length=25,nullable=false) private String surname;
    @NotBlank(message="Введите факультет") @Size(max=20,message="Факультет — не более 20 символов") @Column(length=20,nullable=false) private String faculty;
    @NotNull(message="Введите возраст") @Min(value=16,message="Возраст должен быть не меньше 16") @Max(value=120,message="Возраст должен быть не больше 120") private Integer age;
    public Student() {}
    public Student(String name,String surname,String faculty,Integer age){this.name=name;this.surname=surname;this.faculty=faculty;this.age=age;}
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getName(){return name;} public void setName(String name){this.name=name;}
    public String getSurname(){return surname;} public void setSurname(String surname){this.surname=surname;}
    public String getFaculty(){return faculty;} public void setFaculty(String faculty){this.faculty=faculty;}
    public Integer getAge(){return age;} public void setAge(Integer age){this.age=age;}
}
