package com.bookStore;

import org.springframework.stereotype.Component;

@Component("englishBook")
public class English extends Book {

    @Override
    public void show() {
        System.out.println("英语书");
    }
}
