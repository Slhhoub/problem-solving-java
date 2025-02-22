package org.schhoub;

import java.util.HashMap;
import java.util.HashSet;

public class ChaineUnique {
    // methode 1 avec foreach et hashSet
    public static Boolean checkChaineCaractere(String str){
        HashSet<Character> characterHashSet = new HashSet<>();
        for (char c : str.toCharArray() ){
            if(!characterHashSet.add(c)){
                return true;
            }
        }
        return false;
    }
    // methode 2 avec foreach et hashMap
    public static void checkRepeteCaracter(String str){
        if (str.length()>0){
            HashMap<Character,Integer> characterIntegerHashMap = new HashMap<>();
            for (char c : str.toCharArray()){
                characterIntegerHashMap.put(c,characterIntegerHashMap.getOrDefault(c,0)+1);
            }
            // Afficher les caractères répétés
            System.out.println("Caractères répétés :");
            characterIntegerHashMap.forEach((key, value) -> {
                if (value > 1) {
                    System.out.println("'" + key + "' apparaît " + value + " fois.");
                }
            });
        }else {
            System.out.println("input est vide");
        }

    }

}
