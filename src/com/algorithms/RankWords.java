package com.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class RankWords {

    public void processAndPrint(){

        List<String> competitors = new ArrayList<>();
        competitors.add("newshop");
        competitors.add("shopnow");
        competitors.add("afshion");
        competitors.add("fashionbeats");
        competitors.add("mymarket");
        competitors.add("tcellular");
        competitors.add("betacellular");
        competitors.add("deltacellular");
        competitors.add("eurocell");
        competitors.add("cetracular");
        competitors.add("anacell");

        List<String> reviews = new ArrayList<>();
        reviews.add("betacellular");
        reviews.add("betacellular");
        reviews.add("deltacellular");
        reviews.add("deltacellular");
        reviews.add("eurocell");
        reviews.add("cetracular");
        reviews.add("anacell");

        System.out.println(topNCompetitors(6, 2, competitors, 6, reviews));
    }

    public ArrayList<String> topNCompetitors(int numCompetitors,
                                             int topNCompetitors,
                                             List<String> competitors,
                                             int numReviews,
                                             List<String> reviews)
    {

        HashMap<String, Integer> map = new HashMap<>();

        reviews.stream().forEach(review -> {
            competitors.stream().forEach(competitor -> {
                if(review.toUpperCase().contains(competitor.toUpperCase())){
                    if(map.get(competitor.toUpperCase()) != null) // If it already exists, adds one
                        map.put(competitor.toUpperCase(), map.get(competitor.toUpperCase())+1);
                    else
                        map.put(competitor.toUpperCase(), 1);
                }
            });
        });

        // Creating the return
        ArrayList<String> ret = map.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> entry.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));

        // Limiting returns
        ret = ret.stream().limit(topNCompetitors).collect(Collectors.toCollection(ArrayList::new));

        // Reversing the sort order
        ArrayList<String> fin = new ArrayList<String>();
        ret.stream().forEach(s -> fin.add(0, s));

        return fin;
    }
}