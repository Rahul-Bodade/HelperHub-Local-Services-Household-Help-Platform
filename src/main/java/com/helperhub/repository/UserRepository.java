package com.helperhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helperhub.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
