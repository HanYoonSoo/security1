package com.cos.security1.respository;

import com.cos.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음
public interface UserRepository extends JpaRepository<User, Integer> {

    // findBy규칙 -> Username문법
    // select * form user where username = 1?
    public User findByUsername(String username);    // JPA 쿼리 메소드
}
