package dev.SpringLearning.SpringLearning.RestApiCalling;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/RestApi/SpringBoot")
public class LearningRestApiCall {
    @GetMapping
    public String message(){
        return "Successfully Logged In RestApi ";
    }
    @GetMapping("/GetMethod")
   public String getApi(){
        return "Get Api Method Running ";
    }
    @GetMapping("/GetMethod/{name}")
    public String getApiByName(){
        return "Get Api Method Running Deva ";
    }
    @PostMapping("/PostMethod")
    public String postMethod(){
        return"Post Api Method Is Running";
    }
    @PutMapping("/PutMethod")
    public String putMethod(){
        return "Put Api Method is Running";
    }
    @PatchMapping("/PatchMethod")
    public String patchMethod(){
        return "Patch Api Method is Running";
    }
    @DeleteMapping("/Delete/{id}")
    public int deleteMethod(){
        return 23 ;
    }
}
