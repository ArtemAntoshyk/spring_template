package devtitans.antoshchuk.spring_template.controller;

import devtitans.antoshchuk.spring_template.model.Student;
import devtitans.antoshchuk.spring_template.service.GroupService;
import devtitans.antoshchuk.spring_template.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;
    private GroupService groupService;

    @Autowired
    public StudentController(StudentService studentService, GroupService groupService) {
        this.studentService = studentService;
        this.groupService = groupService;
    }

    @GetMapping("/add")
    public String addGet(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("groups", groupService.getAllGroups());
        return "addStudentForm";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute(name = "student") Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/get/{id}")
    public String getStudent(@PathVariable("id") long id, Model model) {
//        Student student = studentService...
        return "";
    }
}
