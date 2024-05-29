package org.example;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 10; i++) {
            System.out.println(LocalDateTime.now() + " " + i);
        }

        String str = StringUtils.capitalize("andrei");

        System.out.println(str);

    }
}