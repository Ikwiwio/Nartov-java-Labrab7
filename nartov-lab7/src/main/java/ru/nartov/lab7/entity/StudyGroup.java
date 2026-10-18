package ru.nartov.lab7.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity @Table(name="STUDY_GROUPS")
public class StudyGroup {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
    @NotBlank(message="Введите название группы") @Size(max=20,message="Название — не более 20 символов") @Column(name="group_name",length=20,nullable=false,unique=true) private String groupName;
    @NotBlank(message="Введите направление подготовки") @Size(max=80,message="Направление — не более 80 символов") @Column(length=80,nullable=false) private String specialty;
    @NotNull(message="Укажите год обучения") @Min(value=1,message="Курс должен быть от 1 до 6") @Max(value=6,message="Курс должен быть от 1 до 6") private Integer course;
    @NotBlank(message="Укажите куратора") @Size(max=80,message="ФИО куратора — не более 80 символов") @Column(length=80,nullable=false) private String curator;
    public StudyGroup() {}
    public StudyGroup(String groupName,String specialty,Integer course,String curator){this.groupName=groupName;this.specialty=specialty;this.course=course;this.curator=curator;}
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getGroupName(){return groupName;} public void setGroupName(String v){groupName=v;}
    public String getSpecialty(){return specialty;} public void setSpecialty(String v){specialty=v;}
    public Integer getCourse(){return course;} public void setCourse(Integer v){course=v;}
    public String getCurator(){return curator;} public void setCurator(String v){curator=v;}
}
