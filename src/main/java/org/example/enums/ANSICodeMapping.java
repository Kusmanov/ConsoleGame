package org.example.enums;

public enum ANSICodeMapping {
    HILL(ANSICodes.MAGENTA_BG.getValue()),
    RIVER(ANSICodes.CYAN_BG.getValue()),
    BRIDGE(ANSICodes.WHITE_BG.getValue()),
    EMPTY(ANSICodes.BLACK_BG.getValue()),
    HERO(ANSICodes.RED_BG.getValue()),
    MONSTER(ANSICodes.YELLOW_BG.getValue()),
    TEXT(ANSICodes.WHITE_TXT.getValue());

    private final String value;

    ANSICodeMapping(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
