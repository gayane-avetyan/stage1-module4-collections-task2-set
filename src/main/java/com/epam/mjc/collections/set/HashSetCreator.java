package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < sourceList.size(); i++) {

            int element = sourceList.get(i);
            set.add(element);

            while (element % 2 == 0) {
                element /= 2;
                set.add(element);
            }

            if (element % 2 == 1)
                set.add(element * 2);
        }

        return set;
    }
}
