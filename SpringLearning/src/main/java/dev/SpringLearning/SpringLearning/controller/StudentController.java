package dev.SpringLearning.SpringLearning.controller;

import dev.SpringLearning.SpringLearning.model.StudentModel;
import dev.SpringLearning.SpringLearning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/")

public class StudentController {
    @Autowired
    private  StudentService studentServiceObj;
    @PostMapping("addStudent")
    public String addStudent(@RequestBody StudentModel studentPayload){
        studentServiceObj.insertStudentRecord(studentPayload);
        return "Student added Successfully";
    }
    @GetMapping("allStudent")
    public List<StudentModel> getAllStudents(){
        return studentServiceObj.getAllStudents();
    }
    @PutMapping("updateStudent/{id}")
    public String putUpdateStudent(@PathVariable long id,@RequestBody StudentModel updatePayload){
        return this.studentServiceObj.updateStudentDetails(id,updatePayload);
    }
    @PatchMapping("modifyStudentName/{id}")
    public String patchModifyStudentName(@PathVariable long id,@RequestBody StudentModel modifyStudentNamePayload){
        return this.studentServiceObj.modifyStudentName(id, modifyStudentNamePayload);
    }
}
