package com.angular.angularbackend.controllers;

import com.angular.angularbackend.models.UserModel;
import com.angular.angularbackend.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserModel>> listUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listUsers());
    }

    @PostMapping
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(userModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable(value="id")String id, @RequestBody UserModel userModel) {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateUser(id,userModel));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(value="id")String id) {
         service.deleteUser(id);
    }
}
