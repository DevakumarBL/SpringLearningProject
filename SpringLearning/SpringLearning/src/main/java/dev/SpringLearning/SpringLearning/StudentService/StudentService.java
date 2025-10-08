package dev.SpringLearning.SpringLearning.StudentService;

import dev.SpringLearning.SpringLearning.StudentModel.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<StudentModel> studentList = new ArrayList<>();

    public void addStudent(StudentModel stdModelObj){
        studentList.add(stdModelObj);
    }
    public List<StudentModel> getAllStudents(){
        return studentList;
    }
}
