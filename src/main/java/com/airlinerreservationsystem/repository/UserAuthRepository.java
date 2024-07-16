package com.airlinerreservationsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlinerreservationsystem.entity.UserAuth;

public interface UserAuthRepository extends JpaRepository<UserAuth, Long>{

	Optional<UserAuth> findByUserName(String userName);
}