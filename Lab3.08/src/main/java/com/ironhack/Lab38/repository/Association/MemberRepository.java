package com.ironhack.Lab38.repository.Association;

import com.ironhack.Lab38.model.Association.Division;
import com.ironhack.Lab38.model.Association.Member;
import com.ironhack.Lab38.model.Association.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByDivisionAndStatus(Division division, Status status);
}