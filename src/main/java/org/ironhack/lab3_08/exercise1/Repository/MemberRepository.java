package org.ironhack.lab3_08.exercise1.Repository;

import org.ironhack.lab3_08.exercise1.Enum.MembershipStatus;
import org.ironhack.lab3_08.exercise1.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    List<Member> findByStatus(MembershipStatus status);
}
