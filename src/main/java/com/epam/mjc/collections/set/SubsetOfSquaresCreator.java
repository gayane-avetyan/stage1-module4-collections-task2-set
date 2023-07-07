package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        Set<Integer> tree = new TreeSet<>();

        for (int element : sourceList) {
            int elementSquare = element * element;

            if (elementSquare >= lowerBound && elementSquare <= upperBound)
                tree.add(elementSquare);
        }

        return tree;
    }
}
