package com.example.EnterpriseLektion3MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController - Includes @ResponseBody & @Controller
@Controller
public class StudentController {


    @GetMapping("/student")
    public String displayStudentHomepage () {

        return "student.html";
    }

    @GetMapping("/")
    public String goHome () {

        return "home.html";
    }

}
