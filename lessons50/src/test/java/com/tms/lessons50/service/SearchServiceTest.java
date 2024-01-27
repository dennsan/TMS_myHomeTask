package com.tms.lessons50.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchServiceTest {

    @Test
    void searchIndex() {
        SearchService service = new SearchService();
        String param1 = "asdsa";
        String param2 = "sds";

        Integer index = service.searchIndex(param1, param2);

        Assertions.assertEquals(1,index);
    }
}