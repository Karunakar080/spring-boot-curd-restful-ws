package com.sb.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sb.curd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
