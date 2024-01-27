package com.tms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void searchPatternTest() {
        Search search = new Search();
        String param1 = "asdsa";
        String param2 = "SDS";

        Integer index = search.searchPattern(param1,param2);

        Assertions.assertEquals(1, index);
    }
}