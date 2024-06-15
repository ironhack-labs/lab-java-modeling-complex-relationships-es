package org.ironhack.lab308.events;

public enum Status {
    ATTENDING("Attending"),
    NOT_ATTENDING ("Not attending"),
    NO_RESPONSE("No response");

    private final String displayName;

    Status(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


}
