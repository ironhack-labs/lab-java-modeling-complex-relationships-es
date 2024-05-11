package com.ironhack.Lab38.repository.Association;

import com.ironhack.Lab38.model.Association.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
