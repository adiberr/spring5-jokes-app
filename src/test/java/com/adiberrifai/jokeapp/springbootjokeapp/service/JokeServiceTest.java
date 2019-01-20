package com.adiberrifai.jokeapp.springbootjokeapp.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JokeServiceTest {

    private JokeService jokeService;

    @Before
    public void setUp() throws Exception {
        jokeService = new JokeServiceImpl();
    }

    @Test
    public void getJoke() {
        assertNotNull(jokeService.getJoke());
    }
}