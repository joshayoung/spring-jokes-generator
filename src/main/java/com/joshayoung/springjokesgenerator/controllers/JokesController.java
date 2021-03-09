package com.joshayoung.springjokesgenerator.controllers;

import com.joshayoung.springjokesgenerator.services.ChuckQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class JokesController {
    private final ChuckQuotes chuckQuotes;

    public JokesController(ChuckQuotes chuckQuotes) {
        this.chuckQuotes = chuckQuotes;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String quote = this.chuckQuotes.getJoke();
        model.addAttribute("jokes", quote);
        return "test";
    }
}
