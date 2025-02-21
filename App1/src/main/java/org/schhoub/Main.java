package org.schhoub;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------| Calcul Eclipse Zon |-------------------- ");
        // instance class Eclipse zon
        EclipsZone eclipsZone = new EclipsZone();
        //  résultat de calcul  eclipse zon
        eclipsZone.ResultatEclipsZon();
        System.out.println("---------------| trouve le maximum intgers dans liste |-------------------- ");
        MaxIntegerList maxIntegerList = new MaxIntegerList();
        //methode 1
        System.out.println("--methode 1 avec list statique --");
        maxIntegerList.getMaxIntegerListStatic();
        // methode 2
        System.out.println("--methode 2 avec collection List--");
        maxIntegerList.getMaxIntegerListCollection();
    }
}