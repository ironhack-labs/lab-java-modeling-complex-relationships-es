package com.ironhack.asociacion.enfermeras.model;

import com.ironhack.asociacion.enfermeras.enums.MemberStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
@Enumerated(EnumType.STRING)
    private MemberStatus status;

@Temporal(TemporalType.DATE)
    private Date renewalDate;

public Miembro(){

}

public Miembro(String name, MemberStatus status, Date renewalDate) {
    this.name = name;
    this.status = status;
    this.renewalDate = renewalDate;
}

public Long getId(){
    return id;
}

public void setId(Long id){
    this.id = id;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public MemberStatus getStatus() {
        return status;
}

public void setStatus(MemberStatus status) {
        this.status = status;
}

public Date getRenewalDate() {
        return renewalDate;
}

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
