package com.adiberrifai.jokeapp.springbootjokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class JokeServiceTest {

    @InjectMocks
    private JokeServiceImpl jokeServiceImpl;

    @MockBean
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Test
    public void returnJoke_shouldPass() {
        assertNotNull(jokeServiceImpl.getJoke());
    }
}