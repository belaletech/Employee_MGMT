package com.belaletech.FullStackbackend.repository;

import com.belaletech.FullStackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{
}
