package org.schhoub;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static org.schhoub.ChaineUnique.checkChaineCaractere;
import static org.schhoub.ChaineUnique.checkRepeteCaracter;
import static org.schhoub.ClasseNumber.classeNumber;
import static org.schhoub.ClasseNumber.creationList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("---------------| Dans une chaîne unique, aucun caractère n'est identique à un autre caractère. |-------------------- ");
        //methode 1
        System.out.println("--methode 1 avec foreach et hashSet --");
        System.out.println(checkChaineCaractere("schhoub"));
        //methode 2
        System.out.println("--methode 2 avec foreach et hashMap est return combient repete chaque caratere --");
        checkRepeteCaracter("heelloo");
        System.out.println("-----| classer ces nombres du plus petit au plus grand. |-----");
        // Étape 1 : Demande à l'utilisateur d'entrer 3 nombres
        System.out.println("Entrez trois nombres entiers : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int[] result = creationList(number1, number2, number3);
        System.out.println("Avant le tri : " + Arrays.toString(result));
        System.out.println("Après le tri : " + Arrays.toString(classeNumber(result)));
    }
}