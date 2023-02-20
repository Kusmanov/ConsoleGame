package org.example.enums;

public enum PixelMapping {
    HILL(ANSIColor.MAGENTA.getValue()),
    RIVER(ANSIColor.BLUE.getValue()),
    BRIDGE(ANSIColor.WHITE.getValue()),
    EMPTY(ANSIColor.BLACK.getValue());

    private final String value;

    PixelMapping(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
