package org.example;

import org.example.data.Localities;
import org.example.enums.ANSIColor;
import org.example.enums.PixelMapping;

public class App {
    public static void main(String[] args) {

        for (int i = 0; i < Localities.DEFAULT.length; i++) {
            for (int j = 0; j < Localities.DEFAULT[0].length; j++) {
                switch (Localities.DEFAULT[i][j]) {
                    case 'L':
                        System.out.print(PixelMapping.HILL.getValue() + "  " + ANSIColor.RESET.getValue());
                        break;
                    case 'B':
                        System.out.print(PixelMapping.BRIDGE.getValue() + "  " + ANSIColor.RESET.getValue());
                        break;
                    case 'R':
                        System.out.print(PixelMapping.RIVER.getValue() + "  " + ANSIColor.RESET.getValue());
                        break;
                    case ' ':
                        System.out.print(PixelMapping.EMPTY.getValue() + "  " + ANSIColor.RESET.getValue());
                        break;
                }
            }
            System.out.println();
        }
    }
}
