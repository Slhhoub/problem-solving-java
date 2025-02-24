package org.schhoub;

public class inverséeString {

    public static void getChaineCaracterInverce(String str){
        if(str.length()>0){
            char[] chars = str.toCharArray();
            char[] charsNew = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                charsNew[i] = chars[chars.length - 1 - i];
            }
            String newString = new String(charsNew);
            System.out.println("Chaine de caractères inversée  : "+newString);
        }else {
            System.out.println("ne trouve Chaine de caractères pur inversee");
        }
    }
}
