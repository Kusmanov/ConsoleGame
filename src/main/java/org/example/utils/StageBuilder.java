package org.example.utils;

import org.example.data.Localities;
import org.example.entity.Hero;
import org.example.entity.Monster;
import org.example.entity.Unit;

import java.util.ArrayList;

public class StageBuilder {

    private static int stage = 0;
    private static ArrayList<Unit> unitArrayList = new ArrayList<>();
    private static char[][] locality;

    public static void nextStage() {

        if (stage == 0) {
            locality = Localities.DEFAULT;
            unitArrayList.add(new Hero("hero", getHeroLocation(), 10, 10, 10));
            unitArrayList.add(new Monster("monster", getMonsterLocation(), 10, 10, 10));
            stage++;
        } else if (stage == 1) {

        } else if (stage == 2) {

        } else if (stage == 3) {

        }

    }

    public static int getStage() {
        return stage;
    }

    public static ArrayList<Unit> getUnitArrayList() {
        return unitArrayList;
    }

    public static char[][] getLocality() {
        return locality;
    }

    private static int[] getHeroLocation() {
        for (int i = 0; i < locality.length; i++) {
            for (int j = 0; j < locality[0].length; j++) {
                if (locality[i][j] == ' ') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static int[] getMonsterLocation() {
        for (int i = locality.length - 1; i > -1; i--) {
            for (int j = locality[0].length - 1; j > -1; j--) {
                if (locality[i][j] == ' ') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
