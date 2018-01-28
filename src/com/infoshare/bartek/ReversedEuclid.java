package com.infoshare.bartek;

import java.math.BigInteger;

public class ReversedEuclid {

    public static BigInteger[] findInitialNumbers(long divisor, long iterations) {

        if (iterations==0){
            return new BigInteger[] {BigInteger.valueOf(divisor), BigInteger.ZERO};
        }

        BigInteger a = BigInteger.valueOf(divisor);
        BigInteger b = BigInteger.valueOf(iterations);

        if (iterations == 0) {

            return new BigInteger[] {a, BigInteger.ZERO};
        }

        for (int i = 0; i< iterations ; i++) {

            //no clue on how to set the proper values of a,b,c

           /* a = ?;
              b = ?;
              c = ?;  */
        }
        return new BigInteger[] {a,b};
    }
}
