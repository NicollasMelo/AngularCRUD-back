package com.angular.angularbackend.repositories;

import com.angular.angularbackend.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, String> {
}
