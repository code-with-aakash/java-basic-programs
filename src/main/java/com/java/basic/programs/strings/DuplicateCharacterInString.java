package com.java.basic.programs.strings;

import java.util.HashMap;

public class DuplicateCharacterInString {

    public static void main(String[] args) {

        String abc = "aakash";

        char[] ch = abc.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap < Character, Integer >();
        for(int i =0;i<ch.length;i++){
            int count =0;
            hmap.put(ch[i],count++);
        }




    }
}
