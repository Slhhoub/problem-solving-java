package org.schhoub;

public class EclipsZone {

    private static final double pi = 3.14;

    public EclipsZone() {
    }

    public Double clculEclipsZon(){
        int a = 6;
        int b = 12;
        return pi * (a * b);
    }

    public void ResultatEclipsZon(){
        System.out.println("résultat eclips zon est :"+clculEclipsZon());
    }

}
