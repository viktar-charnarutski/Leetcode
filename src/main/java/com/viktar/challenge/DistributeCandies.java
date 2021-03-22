package com.viktar.challenge;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        int count = candyType.length / 2;
        final Set<Integer> uniqueCandies = new HashSet<>();
        for (int j : candyType) {
            uniqueCandies.add(j);
        }
        return Math.min(uniqueCandies.size(), count);
    }
}
