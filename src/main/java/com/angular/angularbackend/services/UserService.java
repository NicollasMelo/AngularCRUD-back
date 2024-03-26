package com.angular.angularbackend.services;

import com.angular.angularbackend.models.UserModel;
import com.angular.angularbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserModel> listUsers() {
        return repository.findAll();
    }

    public UserModel createUser(UserModel userModel) {
        return repository.save(userModel);
    }

    public UserModel updateUser(String id, UserModel userModel) {
        repository.findById(id);
        return repository.save(userModel);
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
