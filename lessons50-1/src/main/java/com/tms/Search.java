package com.tms;



public class Search {
    int index = -1;

    public Integer searchPattern(String text, String pattern){

        String param1 = text.toLowerCase();
        String param2 = pattern.toLowerCase();

        if (param1.contains(param2)){
            index = param1.indexOf(param2);
            return index;
        }
        return index;
    }
}
