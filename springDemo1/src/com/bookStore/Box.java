package com.bookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    @Autowired
    private Book book;
    @Autowired
    private Math math;
    @Autowired
    private English english;

    public void showBox(){
        book.show();
        math.show();
        english.show();
    }
}
