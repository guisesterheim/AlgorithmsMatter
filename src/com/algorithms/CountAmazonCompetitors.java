package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountAmazonCompetitors {

    public void countAndPrint(int numCompetitors, int topNCompetitors, String[] competitors, int numReviews, String[] reviews){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Counting Competitors -------------------");
        System.out.println("#######################################################################");

        count(numCompetitors, topNCompetitors, competitors, numReviews, reviews).forEach(s -> System.out.println(s));
    }

    /*
    int numCompetitors = 6
    int topNCompetitors = 2
    String[] competitors = newshop, shopnow, afshion, fashionbeats, mymarket, tcellular
    int numReviews = 6
    reviews = "newshop is ṕroviding good services in the city; everyone should use newshop"
                "best services by newshop"
                "fashionbeats has great services in the city"
                "I am proud to have fashionbeats"
                "mymarket has awesome services"
                "thanks Newshop for the quick delivery"
     */

    private List<String> count(int numCompetitors, int topNCompetitors, String[] competitors, int numReviews, String[] reviews){
        List<String> competitorsToSearch = Arrays.stream(competitors).collect(Collectors.toList());

        return Arrays.stream(reviews)

                // Creates one object CompetitorCount for each competitor found with count it appears as 1
                .map(review -> {
                    return new CompetitorCount(competitorsToSearch.stream().filter(competitor -> review.toUpperCase().contains(competitor.toUpperCase())).findFirst().orElse(""));
                })

                // Groups by competitor count (sum results)
                .collect(Collectors.groupingBy(CompetitorCount::getCompetitorName, Collectors.counting()))

                // Streams the grouped result
                .entrySet().stream()

                // Maps back to the CompetitorCount object
                .map(stringLongEntry -> new CompetitorCount(stringLongEntry.getKey(), stringLongEntry.getValue()))

                // Sorts by the biggest counts
                .sorted(Comparator.comparing(CompetitorCount::getCount).reversed())

                // Limits to the amount of requested results
                .limit(topNCompetitors)

                // Map to the single string return
                .map(CompetitorCount::getCompetitorName)
                .collect(Collectors.toList());
    }

    private class CompetitorCount {
        private String competitorName;
        private Long count;

        public CompetitorCount(String competitor){
            this.competitorName = competitor;
            this.count = 1L;
        }

        public CompetitorCount(String competitor, Long count){
            this.competitorName = competitor;
            this.count = count;
        }

        public String getCompetitorName() {
            return competitorName;
        }

        public Long getCount() {
            return count;
        }
    }

    private void printForPeek(CompetitorCount competitorCount){
        System.out.println(competitorCount.getCompetitorName() + " - " + competitorCount.getCount());
    }

}
