package com.tms.lessons50.service;

public class SearchService {
    public Integer searchIndex(String param1, String param2){
        int index = -1;

        String lowerCase = param1.toLowerCase();
        String lowerCase1 = param2.toLowerCase();
        if (lowerCase.contains(lowerCase1)) {
            index = lowerCase.indexOf(lowerCase1);
        }
        return index;
    }
}
