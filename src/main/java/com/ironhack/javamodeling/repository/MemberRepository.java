package com.ironhack.javamodeling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironhack.javamodeling.model.Member;

/**
 * MemberRepository
 */
public interface MemberRepository extends JpaRepository<Member, Long>{

    
}
