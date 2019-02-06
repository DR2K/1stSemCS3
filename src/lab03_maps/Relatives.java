//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package lab03_maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

import static java.lang.System.*;

public class Relatives {
    private Map<String, Set<String>> map;

    public Relatives() {
        map = new TreeMap<>();
    }

    public void setPersonRelative(String line) {
        String[] personRelative = line.split(" ");
        if (map.get(personRelative[0]) == null)
            map.put(personRelative[0], new TreeSet<String>());
        map.get(personRelative[0]).add(personRelative[1]);
    }


    public String getRelatives(String person) {
        return person + " is related to " + map.get(person);
    }


    public String toString() {
        String output = "";
        for (Map.Entry<String, Set<String>> entry : map.entrySet())
            output += "\n" + entry.getKey() + " is related to " + entry.getValue();
        return output;
    }
}