package dev.SpringLearning.SpringLearning.RestControllerLearnig;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("RESTAPI/")
public class GetMappingController {
    @GetMapping("GET/{id:[0-9]+}")
    String getById(@PathVariable int id){
        return "The Id Is: "+id;
    }
    @GetMapping("GET/{name:[a-z A-Z]+}")
    String getByName(@PathVariable String name){
        return "The Name Is : "+name;
    }
    @GetMapping("GET/{id}/{name}")
    String getByIdAndName(@PathVariable long id,@PathVariable String name){
        return "User Id is : "+id +" User Name is : "+name;
    }
    @GetMapping("searchIdName")
    public String searchWithQueryParam(
            @RequestParam("id") long id,@RequestParam("name")  String name){
        return "Request Param Id = " +id  +  " Request Param Name =" + name;
    }
}
