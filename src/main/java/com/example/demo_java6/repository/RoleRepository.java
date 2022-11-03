package com.example.demo_java6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_java6.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
