package com.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrisonCellsToggling {

    public void runAndPrint(int[] states, int N){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------- Result of Toggle Houses Active Inactive ----------------");
        System.out.println("#######################################################################");

        int[] ret = prisonAfterNDays(states, N);
        for(int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]+", ");
        }
    }

    public int[] prisonAfterNDays(int[] cells, int N) {
        N = (N - 1) % 14 + 1;
        for (int i = 0; i < N; i++)
            cells = nextDayState(cells);
        return cells;
    }

    private int[] nextDayState(int[] cells) {
        int[] next = new int[cells.length];
        for(int i = 1; i < cells.length - 1; i++)
            next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
        return next;
    }

}
