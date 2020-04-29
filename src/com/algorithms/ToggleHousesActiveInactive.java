package com.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToggleHousesActiveInactive {

    public void runAndPrint(int[] states, int days){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------- Result of Toggle Houses Active Inactive ----------------");
        System.out.println("#######################################################################");

        processToggleHousesActiveInactive(states, days).forEach(state -> System.out.println(state));
    }

    private List<Integer> processToggleHousesActiveInactive(int[] states, int days){
        int values[] = new int[states.length];
        for (Integer i = 0; i < states.length ; i++ ){
            values[i] = states[i];
        }
        for (Integer k = 0; k < days ; k++ ){
            for (Integer j = 1; j < values.length - 1 ; j++ ){
                if ((values[j-1] == 1 && values[j+1] == 1) || (values[j-1] == 0 && values[j+1] == 0)){
                    states[j] = 0;
                } else{
                    states[j] = 1;
                }
            }
            if (values[1] == 0){
                states[0] = 0;
            } else{
                states[0] = 1;
            }
            if (values[6] == 0){
                states[7] = 0;
            } else{
                states[7] = 1;
            }
            for (Integer i = 0; i < states.length ; i++ ){
                values[i] = states[i];
            }
        }

        return Arrays.stream(values).boxed().collect(Collectors.toList());
    }

}
