package org.example.utils;

import org.example.entity.Hero;
import org.example.entity.Unit;
import org.example.enums.ANSICodes;
import org.example.enums.ANSICodeMapping;

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

        Hero hero = null;

        if (unit.getClass().getSimpleName().equals("Hero")) {
            hero = (Hero) unit;
        }

        for (int i = 0; i < locality.length; i++) {
            for (int j = 0; j < locality[0].length; j++) {
                if (Arrays.equals(unit.getLocation(), new int[]{i, j})) {
                    if (unit.getClass().getSimpleName().equals("Hero")) {
                        locality[i][j] = 'H';
                    } else {
                        locality[i][j] = 'M';
                    }
                    if (iterator.hasNext()) {
                        unit = iterator.next();
                    }
                }

                switch (locality[i][j]) {
                    case 'L':
                        System.out.print(ANSICodeMapping.HILL.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'B':
                        System.out.print(ANSICodeMapping.BRIDGE.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'R':
                        System.out.print(ANSICodeMapping.RIVER.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'H':
                        System.out.print(ANSICodeMapping.HERO.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'M':
                        System.out.print(ANSICodeMapping.MONSTER.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                    case 'X':
                        if (hero != null) {
                            if (i == 0 && j == 1) {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + "H:" + ANSICodes.RESET.getValue());
                            } else if (i == 0 && j == 2) {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + hero.getHealth() + ANSICodes.RESET.getValue());
                            } else if (i == 0 && j == 4) {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + "A:" + ANSICodes.RESET.getValue());
                            } else if (i == 0 && j == 5) {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + hero.getAgility() + ANSICodes.RESET.getValue());
                            } else if (i == 0 && j == 7) {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + "P:" + ANSICodes.RESET.getValue());
                            } else if (i == 0 && j == 8) {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + hero.getPower() + ANSICodes.RESET.getValue());
                            } else {
                                System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + "  " + ANSICodes.RESET.getValue());
                            }
                        } else {
                            System.out.print(ANSICodeMapping.RIVER.getValue() + ANSICodeMapping.TEXT.getValue() + "  " + ANSICodes.RESET.getValue());
                        }
                        break;
                    case ' ':
                        System.out.print(ANSICodeMapping.EMPTY.getValue() + "  " + ANSICodes.RESET.getValue());
                        break;
                }
            }
            System.out.println();
        }
    }
}
