package com.bookStore;

import org.springframework.stereotype.Component;

@Component
public class Math extends Book {
    @Override
    public void show() {
        System.out.println("数学书");
    }
}
