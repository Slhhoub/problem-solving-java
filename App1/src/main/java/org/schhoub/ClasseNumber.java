package org.schhoub;

import java.util.Arrays;

public class ClasseNumber {

    /*
     etape 1 :
         input : cree liste contient 3 valeurs integer
         output : return liste avec les valeurs number classes
         edage casse : si entre des valeur null return message
     etape 2 :
        conception de la solution :
          - ajouter classe scanner pour entre des number
          - cree une liste avec les valeur qui entre une utilisateur
          - cree une function qui cheque les valeur plus des autre et stocker dans une eutre liste
          - return nouvelle liste
     */

    public static int[] creationList(int number1,int number2,int number3){
        return new int[]{number1,number2,number3};
    }


    public static int[] classeNumber(int[] liste){
        Arrays.sort(liste);
        return liste;
    }
}
