package edu.miu.swe.eregistrar.controller;

import edu.miu.swe.eregistrar.model.Student;
import edu.miu.swe.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/api/student/list")
    public List<Student> studentList() {
        return this.studentService.findAll();
    }

    @PostMapping("/api/student/register")
    public Student registerStudent(@RequestBody Student student) {
        return this.studentService.save(student);
    }

    @GetMapping("/api/student/get/{id}")
    public Student getStudent(@PathVariable("id") Long id) {
        return this.studentService.findById(id);
    }

    @PutMapping("/api/student/update/{id}")
    public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        student.setStudentId(id);
        return this.studentService.save(student);
    }

    @DeleteMapping("/api/student/delete/{id}")
    public void updateStudent(@PathVariable("id") Long id) {
        this.studentService.deleteById(id);
    }

}
