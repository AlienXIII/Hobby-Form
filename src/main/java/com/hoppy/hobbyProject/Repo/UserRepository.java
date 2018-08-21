package com.hoppy.hobbyProject.Repo;


import com.hoppy.hobbyProject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}