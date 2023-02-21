package org.example.enums;

public enum ANSICodes {

    BLACK_TXT("\u001b[30m"),
    RED_TXT("\u001b[31m"),
    GREEN_TXT("\u001b[32m"),
    YELLOW_TXT("\u001b[33m"),
    BLUE_TXT("\u001b[34m"),
    MAGENTA_TXT("\u001b[35m"),
    CYAN_TXT("\u001b[36m"),
    WHITE_TXT("\u001b[37m"),
    BLACK_BG("\u001b[40m"),
    RED_BG("\u001b[41m"),
    GREEN_BG("\u001b[42m"),
    YELLOW_BG("\u001b[43m"),
    BLUE_BG("\u001b[44m"),
    MAGENTA_BG("\u001b[45m"),
    CYAN_BG("\u001b[46m"),
    WHITE_BG("\u001b[47m"),
    RESET("\u001b[0m");

    private final String value;

    ANSICodes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
