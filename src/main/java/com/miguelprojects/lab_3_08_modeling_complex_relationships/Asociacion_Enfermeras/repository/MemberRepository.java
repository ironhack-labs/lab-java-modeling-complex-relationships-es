package com.miguelprojects.lab_3_08_modeling_complex_relationships.Asociacion_Enfermeras.repository;

import com.miguelprojects.lab_3_08_modeling_complex_relationships.Asociacion_Enfermeras.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository <Member, Long>{
}
