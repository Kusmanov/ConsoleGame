package org.example.utils;

import org.example.data.Localities;
import org.example.enums.ANSICodes;
import org.example.enums.PixelMapping;

public class FrameBuilder {
    public static void getFrame() {
        for (int i = 0; i < Localities.DEFAULT.length; i++) {
            for (int j = 0; j < Localities.DEFAULT[0].length; j++) {
                switch (Localities.DEFAULT[i][j]) {
                    case 'L':
                        System.out.print(PixelMapping.HILL.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'B':
                        System.out.print(PixelMapping.BRIDGE.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'R':
                        System.out.print(PixelMapping.RIVER.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case ' ':
                        System.out.print(PixelMapping.EMPTY.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                }
            }
            System.out.println();
        }
    }
}
