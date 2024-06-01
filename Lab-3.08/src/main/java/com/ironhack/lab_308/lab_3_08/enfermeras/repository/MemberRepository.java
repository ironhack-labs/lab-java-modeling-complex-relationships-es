package com.ironhack.lab_308.lab_3_08.enfermeras.repository;

import com.ironhack.lab_308.lab_3_08.enfermeras.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
