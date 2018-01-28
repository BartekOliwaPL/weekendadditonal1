package com.infoshare.bartek;

public class EuclidGcd {

    public long gcd(long a, long b) {

        if (b > a) {
            long c = b;
            b = a;
            a = c;
        }

        long r = a % b;

        if (r == 0)
            return b;
        else
            return gcd(b, r);
    }
}


