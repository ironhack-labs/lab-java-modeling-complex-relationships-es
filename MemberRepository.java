package com.example.nursingassociation.repository;

import com.example.nursingassociation.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> { }
