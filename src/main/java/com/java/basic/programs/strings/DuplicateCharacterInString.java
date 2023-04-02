package com.java.basic.programs.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacterInString {

    public static void main(String[] args) {

        String abc = "aakash";

        char[] ch = abc.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap < Character, Integer >();

        for(int i =0;i<ch.length;i++){
        	int count =0;
            if(hmap.containsKey(ch[i])){
            	hmap.put(ch[i], hmap.get(ch[i])+1);
            	
//            int cn2=0;
//                for (Entry<Character, Integer> entry: hmap.entrySet())
//                {
//                    if (ch[i] ==entry.getKey()) {
//                        cn2=entry.getValue();
//                    }

            	
            
//            hmap.put(ch[i],cn2+1);
                }
        
            else {
            	hmap.put(ch[i],count+1);	
            }
        }
        
        hmap.entrySet().forEach(entry -> {
        	if(entry.getValue()>1)
            System.out.println(entry.getKey() + " " + entry.getValue());
        });




    }
}
