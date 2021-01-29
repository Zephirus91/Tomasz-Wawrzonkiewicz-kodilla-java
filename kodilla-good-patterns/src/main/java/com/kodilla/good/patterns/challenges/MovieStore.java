package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {
    public static Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static String join() {
        String listOfAllStrings = getMovies().entrySet().stream()
                .flatMap(x -> x.getValue().stream())
                .collect(Collectors.joining("!"));

        return listOfAllStrings;
    }

    public static void main(String[] args) {  //skrót "psvm"
        System.out.println(MovieStore.join());
    }

}