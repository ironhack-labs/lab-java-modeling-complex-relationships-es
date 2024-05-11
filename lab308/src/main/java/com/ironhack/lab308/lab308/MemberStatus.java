package com.ironhack.lab308.lab308;

public enum MemberStatus {
    ACTIVE("ACTIVO"),
    LAPSED("LAPSADO");

    private final String description;

    MemberStatus(String description) {
        this.description = description;
    }
}
