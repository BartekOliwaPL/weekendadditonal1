package com.infoshare.bartek;

public class Atm {

    public int solve(int x) {
        if (x % 10 != 0) {
            return -1;
        }

        int amount = 0;

        amount += x / 500;
        x = x % 500;
        amount += x / 200;
        x = x % 200;
        amount += x / 100;
        x = x % 100;
        amount += x / 50;
        x = x % 50;
        amount += x / 20;
        x = x % 20;
        amount += x / 10;
        x = x % 10;

        return amount;
    }
}