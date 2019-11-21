package com.vlad.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitlabTestFirstTest {

    @Test
    void getHello() {
        GitlabTestFirst first = new GitlabTestFirst();
        String result = first.getHello();

        assertEquals("hello first", result);
        System.out.println(result);
    }
}