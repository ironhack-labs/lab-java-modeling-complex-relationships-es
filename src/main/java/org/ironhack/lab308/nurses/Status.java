package org.ironhack.lab308.nurses;

public enum Status {
    ACTIVE("Active"),
    LAPSED("Lapsed");

    private final String displayName;

    Status(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
