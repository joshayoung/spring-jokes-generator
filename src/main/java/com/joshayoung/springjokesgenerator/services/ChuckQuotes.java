package com.joshayoung.springjokesgenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckQuotes {

    public final ChuckNorrisQuotes quotes;

    @Autowired
    public ChuckQuotes(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
