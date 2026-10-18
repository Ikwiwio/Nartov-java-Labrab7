package ru.nartov.lab7.controller;
import jakarta.validation.Valid;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.validation.BindingResult;import org.springframework.web.bind.annotation.*;
import ru.nartov.lab7.entity.Student;import ru.nartov.lab7.service.StudentService;
@Controller public class StudentController {
 private final StudentService service;public StudentController(StudentService service){this.service=service;}
 @GetMapping({"/","/list"}) public String list(Model model){model.addAttribute("students",service.findAll());return "list-students";}
 @GetMapping("/addStudentForm") public String addForm(Model model){model.addAttribute("student",new Student());model.addAttribute("formTitle","Добавить студента");return "add-student-form";}
 @PostMapping("/saveStudent") public String save(@Valid @ModelAttribute("student") Student student,BindingResult result,Model model){if(result.hasErrors()){model.addAttribute("formTitle",student.getId()==null?"Добавить студента":"Редактировать студента");return "add-student-form";}service.save(student);return "redirect:/list";}
 @GetMapping("/showUpdateForm") public String edit(@RequestParam Long studentId,Model model){Student student=service.findById(studentId);model.addAttribute("student",student);model.addAttribute("formTitle","Редактировать студента");return "add-student-form";}
 @GetMapping("/deleteStudent") public String delete(@RequestParam Long studentId){service.deleteById(studentId);return "redirect:/list";}
}
