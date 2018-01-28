package com.infoshare.bartek;

public class CatDog {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;

        switch (humanYears) {
            case 0:
                catYears = 0;
                dogYears = 0;
                break;

            case 1:
                catYears = 15;
                dogYears = 15;
                break;

            case 2:
                catYears = 24;
                dogYears = 24;
                break;

            default:
                catYears = 24 + (humanYears - 2) * 4;
                dogYears = 24 + (humanYears - 2) * 5;
                break;
        }
        return new int[]{humanYears,catYears,dogYears};
    }
}
