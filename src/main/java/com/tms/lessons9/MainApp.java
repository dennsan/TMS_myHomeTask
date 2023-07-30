package com.tms.lessons9;

public class MainApp {
    public static void main(String[] args) {

        String numDoc = "1234-xCz-4567-aCf-9q8w";
        PrintSearch.PrintN(numDoc);
        PrintSearch.replaceN(numDoc);
        PrintSearch.printA(numDoc);
        PrintSearch.printStringB(numDoc);
        PrintSearch.searchEndNum(numDoc);
        PrintSearch.searchNumDoc(numDoc);
        PrintSearch.checkA(numDoc);
    }
}
