package com.vlad.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitlabTestSecondTest {

    @Test
    void getHello() {
        GitlabTestSecond first = new GitlabTestSecond();
        String result = first.getHello();

        assertEquals("hello second", result);
        System.out.println(result);
    }
}