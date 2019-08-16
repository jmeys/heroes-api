package be.ordina.controller;

import be.ordina.model.Hero;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/heroes")
public class HeroController {

    private List<Hero> someHeroes = List.of(
            new Hero(1, "Ken"),
            new Hero(2, "Yannick"),
            new Hero(3, "Pieter"));

    @GetMapping
    public List<Hero> heroes() {
        return someHeroes;
    }

    @GetMapping("/{id}")
    public Hero hero(@PathVariable("id") String id) {
        return someHeroes.stream()
                .filter(h -> Integer.toString(h.getId()).equals(id))
                .findFirst()
                .orElse(null);
    }
}
