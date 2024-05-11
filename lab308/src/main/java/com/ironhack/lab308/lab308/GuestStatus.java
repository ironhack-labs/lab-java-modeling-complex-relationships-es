package com.ironhack.lab308.lab308;

public enum GuestStatus {
    ATTENDING("ASISTIENDO"),
    NOT_ATTENDING("NO ASISTIENDO"),
    NO_RESPONSE("SIN RESPUESTA");

    private final String description;

    GuestStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
