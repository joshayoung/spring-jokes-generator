package com.joshayoung.springjokesgenerator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckQuotesImpl implements ChuckQuotes {
    public final ChuckNorrisQuotes quotes;

    public ChuckQuotesImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return this.quotes.getRandomQuote();
    }
}
