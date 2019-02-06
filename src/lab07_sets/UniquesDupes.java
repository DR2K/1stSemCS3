package lab07_sets;

import java.util.*;

import static java.lang.System.*;

public class UniquesDupes {
    public static Set<String> getUniques(String input) {

        Set<String> uniques = new TreeSet<String>(Arrays.asList(input.split(" ")));

        return uniques;
    }

    public static Set<String> getDupes(String input) {
        String[] words = input.split(" ");
        Set<String> dupes = new TreeSet<String>();
        Set<String> uniques = new TreeSet<String>();
        for (String x : words)
            if (!uniques.add(x))
                dupes.add(x);


        return dupes;
    }
}