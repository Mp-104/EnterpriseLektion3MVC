package com.example.EnterpriseLektion3MVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;

//@RestController - Includes @ResponseBody & @Controller
@Controller
public class StudentController {

    private final UserRepository repository;

    public StudentController (UserRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/student")
    public String displayStudentHomepage () {

        return "student.html";
    }

    @GetMapping("/")
    public String goHome () {

        return "home.html";
    }

    int x = 0;

    @GetMapping("/greet")
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        x ++;

//        MyUser user = repository.findById(1L).get();
//        user.numberOfClicks ++;
//        repository.save(user);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();

        User user1 = (User) principal;

        MyUser user2 = repository.findByName(user1.getUsername()).get();
        user2.numberOfClicks ++;
        repository.save(user2);

        //response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Hello World! " + user2.getNumberOfClicks() );

        System.out.println("Hello world " + x);
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

    }

}
