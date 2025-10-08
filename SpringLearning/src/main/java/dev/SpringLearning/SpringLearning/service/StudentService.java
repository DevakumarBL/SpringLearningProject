package dev.SpringLearning.SpringLearning.service;

import dev.SpringLearning.SpringLearning.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    List<StudentModel> studentList = new ArrayList<>();

    public void insertStudentRecord(StudentModel stdModelObj){
        studentList.add(stdModelObj);
    }
    public List<StudentModel> getAllStudents(){
        return studentList;
    }
    public String updateStudentDetails(long id,StudentModel updatePayload){
      for (StudentModel item : studentList){
          if (item.getStudentId()==id){
              item.setStudentId(updatePayload.getStudentId());
              item.setStudentName(updatePayload.getStudentName());
              item.setStudentDept(updatePayload.getStudentDept());
              item.setStudentGrade(updatePayload.getStudentGrade());
              item.setCollegeName(updatePayload.getCollegeName());
              return "record update successfully";
          }
      }
      return "id not found";
    }

    public String modifyStudentName(long id,StudentModel modifyStudentNamePayload){
        for(StudentModel data : studentList){
            if(data.getStudentId() == id ){
                data.setStudentName(modifyStudentNamePayload.getStudentName());
                return "Record Modified Success";
            }
        }
        return "ID Not found";
    }

}
