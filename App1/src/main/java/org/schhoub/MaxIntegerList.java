package org.schhoub;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class MaxIntegerList {

    private Random random = new Random();

    // cree et affiche une list static des valeur avec le max valeur
    public void getMaxIntegerListStatic(){
        int[] listIntegers = new int[10];
        for (int i = 0; i < 10; i++) {
            listIntegers[i] = random.nextInt();
        }
        int valeurMax=listIntegers[0];
        for (int i=0;i< listIntegers.length ;i++){
            System.out.println("valeur de index "+i+" est : "+listIntegers[i]);
            if(listIntegers[i]>valeurMax){ valeurMax=listIntegers[i];}
        }
        System.out.println("le valeur maximum : "+valeurMax);
    }

    // cree et affiche une list des valeur avec le max valeur
    public void getMaxIntegerListCollection() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt());
        }
        integerList.stream().forEachOrdered(num -> System.out.println("la valeur "+integerList.indexOf(num)+" : "+ num));
        Optional<Integer> maxValeur = integerList.stream().max(Integer::compareTo);
        maxValeur.ifPresent(value -> System.out.println("valeur maximal :"+value));
    }
}
