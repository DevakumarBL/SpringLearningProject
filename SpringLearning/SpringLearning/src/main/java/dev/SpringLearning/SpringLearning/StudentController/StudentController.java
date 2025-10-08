package dev.SpringLearning.SpringLearning.StudentController;

import dev.SpringLearning.SpringLearning.StudentModel.StudentModel;
import dev.SpringLearning.SpringLearning.StudentService.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/student/")
public class StudentController {
    private StudentService studentServiceObj;
    public StudentController(StudentService studentServiceObj) {
        this.studentServiceObj = studentServiceObj;
    }

    @PostMapping("addStudent")
    public String addStudent(@RequestBody StudentModel stdModelObj){
        studentServiceObj.addStudent(stdModelObj);
        return "Student added Successfully";
    }
    @GetMapping("/allStudent")
    public List<StudentModel> getAllStudents(){
        return studentServiceObj.getAllStudents();
    }

}
