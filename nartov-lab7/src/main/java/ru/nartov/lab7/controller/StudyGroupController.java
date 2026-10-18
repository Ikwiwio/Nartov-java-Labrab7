package ru.nartov.lab7.controller;
import jakarta.validation.Valid;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.validation.BindingResult;import org.springframework.web.bind.annotation.*;
import ru.nartov.lab7.entity.StudyGroup;import ru.nartov.lab7.service.StudyGroupService;
@Controller @RequestMapping("/groups") public class StudyGroupController {
 private final StudyGroupService service;public StudyGroupController(StudyGroupService service){this.service=service;}
 @GetMapping public String list(Model model){model.addAttribute("groups",service.findAll());return "list-groups";}
 @GetMapping("/new") public String addForm(Model model){model.addAttribute("studyGroup",new StudyGroup());model.addAttribute("formTitle","Добавить учебную группу");return "add-group-form";}
 @PostMapping("/save") public String save(@Valid @ModelAttribute("studyGroup") StudyGroup group,BindingResult result,Model model){if(result.hasErrors()){model.addAttribute("formTitle",group.getId()==null?"Добавить учебную группу":"Редактировать учебную группу");return "add-group-form";}service.save(group);return "redirect:/groups";}
 @GetMapping("/edit") public String edit(@RequestParam Long groupId,Model model){model.addAttribute("studyGroup",service.findById(groupId));model.addAttribute("formTitle","Редактировать учебную группу");return "add-group-form";}
 @GetMapping("/delete") public String delete(@RequestParam Long groupId){service.deleteById(groupId);return "redirect:/groups";}
}
