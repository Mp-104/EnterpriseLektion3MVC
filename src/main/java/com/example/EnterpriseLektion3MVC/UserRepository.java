package com.example.EnterpriseLektion3MVC;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByName (String name);

}
