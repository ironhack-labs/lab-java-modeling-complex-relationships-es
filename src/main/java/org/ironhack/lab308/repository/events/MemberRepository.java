package org.ironhack.lab308.repository.events;

import org.ironhack.lab308.nurses.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository <Member, Integer>{

}
