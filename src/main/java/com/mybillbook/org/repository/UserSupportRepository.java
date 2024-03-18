package com.mybillbook.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybillbook.org.entities.UserSupport;
@Repository
public interface UserSupportRepository extends JpaRepository<UserSupport, Integer> {

}
