package lab07_sets;//� A+ Computer Science  -  www.apluscompsci.com

import java.util.*;

import static java.lang.System.*;

public class MathSet {
    private Set<Integer> one;
    private Set<Integer> two;

    public MathSet() {
        one = new TreeSet<Integer>();
        two = new TreeSet<Integer>();
    }

    public MathSet(String o, String t) {
        one = new TreeSet<Integer>();
        two = new TreeSet<Integer>();
        for (String x : Arrays.asList(o.split(" ")))
            one.add(Integer.parseInt(x));
        for (String x : Arrays.asList(t.split(" ")))
            two.add(Integer.parseInt(x));
    }

    public Set<Integer> union() {
        Set<Integer> union = new TreeSet<>();
        union.addAll(one);
        union.addAll(two);
        return union;
    }

    public Set<Integer> intersection() {
        Set<Integer> union = new TreeSet<>();
        Set<Integer> retVal = new TreeSet<>();
        union.addAll(one);

        for (int x : two)
            if (!union.add(x))
                retVal.add(x);
        return retVal;

    }

    public Set<Integer> differenceAMinusB() {
        Set<Integer> union = new TreeSet<>();
        Set<Integer> retVal = new TreeSet<>();

        union.addAll(two);
        for (int x : one)
            if (union.add(x))
                retVal.add(x);
        return retVal;


    }

    public Set<Integer> differenceBMinusA() {
        Set<Integer> union = new TreeSet<>();
        Set<Integer> retVal = new TreeSet<>();

        union.addAll(one);
        for (int x : two)
            if (union.add(x))
                retVal.add(x);
        return retVal;
    }

    public Set<Integer> symmetricDifference() {
        Set<Integer> union = new TreeSet<>();
        union.addAll(differenceAMinusB());
        union.addAll(differenceBMinusA());
        return union;
    }

    public String toString() {
        return "Set one " + one + "\n" + "Set two " + two + "\n";
    }
}