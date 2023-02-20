package org.example.utils;

import org.example.entity.Unit;
import org.example.enums.ANSICodes;
import org.example.enums.PixelMapping;

import java.util.Arrays;
import java.util.Iterator;

public class FrameBuilder {
    public static void getFrame() {
        if (StageBuilder.getStage() == 0) {
            StageBuilder.nextStage();
        }

        char[][] locality = StageBuilder.getLocality();
        Iterator<Unit> iterator = StageBuilder.getUnitArrayList().iterator();
        Unit unit = iterator.next();

        for (int i = 0; i < locality.length; i++) {
            for (int j = 0; j < locality[0].length; j++) {
                if (Arrays.equals(unit.getLocation(), new int[]{i, j})) {
                    if (unit.getClass().getSimpleName().equals("Hero")) {
                        locality[i][j] = 'H';
                        if (iterator.hasNext()) {
                            unit = iterator.next();
                        }
                    } else {
                        locality[i][j] = 'M';
                        if (iterator.hasNext()) {
                            unit = iterator.next();
                        }
                    }
                }

                switch (locality[i][j]) {
                    case 'L':
                        System.out.print(PixelMapping.HILL.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'B':
                        System.out.print(PixelMapping.BRIDGE.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'R':
                        System.out.print(PixelMapping.RIVER.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'H':
                        System.out.print(PixelMapping.HERO.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'M':
                        System.out.print(PixelMapping.MONSTER.getValue() + "  " + ANSICodes.RESET.getValue());
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
