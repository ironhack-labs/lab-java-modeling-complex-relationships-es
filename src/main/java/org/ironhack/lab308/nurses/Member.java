package org.ironhack.lab308.nurses;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Integer memberId;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status memberStatus;
    private LocalDate renewalDate;

    @OneToOne (mappedBy = "president")
    private Member divisionPresident;

    @ManyToOne
    private Division divisions;

    public Member(String name, Status memberStatus, LocalDate renewalDate) {
        this.name = name;
        this.memberStatus = memberStatus;
        this.renewalDate = renewalDate;
    }

    public Member() {
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Status status) {
        this.memberStatus = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }
}
