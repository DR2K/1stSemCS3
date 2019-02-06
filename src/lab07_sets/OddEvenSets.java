package lab07_sets;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import org.omg.CORBA.INTERNAL;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class OddEvenSets {
    private Set<Integer> odds;
    private Set<Integer> evens;
    private Set<Integer> perfect;

    public OddEvenSets() {
        odds = new TreeSet<Integer>();
        evens = new TreeSet<Integer>();
        perfect = new TreeSet<Integer>();

    }

    public OddEvenSets(String line) {
        odds = new TreeSet<Integer>();
        evens = new TreeSet<Integer>();
        perfect = new TreeSet<Integer>();
        String[] linesplit = line.split(" ");
        for (String x : linesplit) {
            if (Integer.parseInt(x) % 2 == 0)
                evens.add(Integer.parseInt(x));
            else
                odds.add(Integer.parseInt(x));

            createPerfect(Integer.parseInt(x));
        }

    }

    private void createPerfect(int i) {
        int total = 0;
        for (int x = 1; x < i; x++) {
            if (i % x == 0)
                total += x;
        }
        if (total == i)
            perfect.add(i);
    }

    public String toString() {

        return "ODDS : " + odds + "\nEVENS : " + evens + "\nPerfect : " + perfect;
    }
}