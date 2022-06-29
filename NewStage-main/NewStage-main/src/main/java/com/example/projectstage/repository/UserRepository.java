package com.example.projectstage.repository;

import com.example.projectstage.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<userModel,Long> {

}
