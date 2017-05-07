package org.jointheleague.level_4.sieve_of_erasthones;
/**
Copyright The League of Amazing Programmers 2013-2017
 *    Level 4
 *    Sieve of Erasthones
 *    Solution
 */

    /**
     * Implementation of Sieve of Eratosthenes.
     * <p> 
     * E.g.: erastosthenes(2012) prints out 305 primes starting at 2 and ending 
     * at 2011
     * 
     * @param len the upper bound of primes to find 
     * @see http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     */
    private void eratosthenes(int len) {
        int[] sieve = new int[len];

        //initialize
        for(int i = 2; i < len; i++) {
            sieve[i] = i;
        }

        // cross out all non-primes
        for (int i = 2; i * i < len; i++) {
            if (sieve[i] != 0) { 
                // found prime i; cross out multiples of i
                for (int k = i * i; k < len; k += i) { 
                    sieve[k] = 0;
                }
            }
        }

        // print out results
        int count = 0;
        for (int i = 2; i < len; i++) {
            if (sieve[i] != 0) {
                System.out.println(sieve[i]);
                count++;
            }
        }
        System.out.println("Number of primes less than "
                + len + " is " + count);
}