package com.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAmazonLogs {

    public void sortAndPrint(String[] array){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------ Result of Sorting Logs -----------------------");
        System.out.println("#######################################################################");

        sort(array).forEach(s -> System.out.println(s));
    }

    /*
    logs[0] = "a1 9 2 3 1";
    logs[1] = "g1 Act car";
    logs[2] = "zo4 4 7";
    logs[3] = "ab1 off KEY dog";
    logs[4] = "a8 act zoo";
     */

    private List<String> sort(String[] array){
        return Arrays.stream(array)
                .sorted(buildComparator())
                .collect(Collectors.toList());
    }

    private Comparator<String> buildComparator(){
        return new Comparator<String>() {
            private boolean isNumber(String s) {
                return s.matches("[-+]?\\d*\\.?\\d+");
            }

            private boolean isThereAnyNumber(String a, String b) {
                return isNumber(a) || isNumber(b);
            }

            @Override
            public int compare(String s, String t1) {
                String removedFirstIdentifierA = s.substring(s.indexOf(" ")); // Discards the first identifier
                String removedFirstIdentifierB = t1.substring(t1.indexOf(" ")); // Discards the first identifier

                String secondSetA = s.split(" ")[1];    // Gets the second set of numbers
                String secondSetB = t1.split(" ")[1];   // Gets the second set of numbers

                return isThereAnyNumber(secondSetA, secondSetB)
                        ? isNumber(secondSetA) ? 1 : -1
                        : removedFirstIdentifierA.compareTo(removedFirstIdentifierB);
            }
        };
    }

}
