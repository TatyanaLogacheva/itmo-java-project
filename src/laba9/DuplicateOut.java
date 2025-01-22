package laba9;

import java.util.*;

public class DuplicateOut {
    public static Set<Integer> duplicateOut(List<Integer> list) {
        Set<Integer> collection2 = new HashSet<>();
        for (Integer item : list) {
            collection2.add(item);
        }
        return collection2;
    }

    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        collection.add(56);
        collection.add(20);
        collection.add(14);
        collection.add(56);
        collection.add(20);
        collection.add(20);
        System.out.println(duplicateOut(collection));


    }
}
