package org.example.enums;

public enum PixelMapping {
    HILL(ANSICodes.MAGENTA.getValue()),
    RIVER(ANSICodes.CYAN.getValue()),
    BRIDGE(ANSICodes.WHITE.getValue()),
    EMPTY(ANSICodes.BLACK.getValue()),
    HERO(ANSICodes.RED.getValue()),
    MONSTER(ANSICodes.YELLOW.getValue());

    private final String value;

    PixelMapping(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
