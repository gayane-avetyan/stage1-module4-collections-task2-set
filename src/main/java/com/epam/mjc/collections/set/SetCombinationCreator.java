package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> set = new HashSet<>();
        Iterator<String> iteratorFirst = firstSet.iterator();
        Iterator<String> iteratorThird = thirdSet.iterator();

        while (iteratorFirst.hasNext()) {

            String element = iteratorFirst.next();

            if (secondSet.contains(element))
                set.add(element);
        }

        while (iteratorThird.hasNext()) {

            String element = iteratorThird.next();

            if (!firstSet.contains(element) && !secondSet.contains(element))
                set.add(element);
        }

        return set;
    }
}
