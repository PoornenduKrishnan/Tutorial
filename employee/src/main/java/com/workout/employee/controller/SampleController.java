package com.workout.employee.controller;

import com.workout.employee.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    private List<User> userList = new ArrayList<>();

    @GetMapping("/health")
    public String checkHealth() {
        return "Up and Running";
//        System.out.println("Up and Running");
    }

//    @PostMapping("/create")
//    public void createUser(@RequestBody User user) {
//        userList.add(user);
//    }
//
//    @GetMapping("/getUser/{name}")
//    public void createUser(@PathVariable String name) {
//        userList.add(user);
//    }
}
