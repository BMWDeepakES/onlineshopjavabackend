package com.ecomadmin.ecommeradmin.repository;

import com.ecomadmin.ecommeradmin.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

}
