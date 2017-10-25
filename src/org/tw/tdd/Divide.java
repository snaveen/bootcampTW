package org.tw.tdd;

public class Divide {
    public long doOperation(long numerator, long denominator) {
        if(denominator==0)
            throw new IllegalArgumentException();
        return numerator/denominator;
    }
}
