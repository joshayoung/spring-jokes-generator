package com.joshayoung.springjokesgenerator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckQuotes {
    public final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public ChuckQuotes(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
