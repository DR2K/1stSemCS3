//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package lab03_maps;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class SpanishToEnglish {
    private Map<String, String> pairs;

    public SpanishToEnglish() {
        pairs = new TreeMap<>();
    }

    public void putEntry(String entry) {
        String[] list = entry.split(" ");
        pairs.put(list[0], list[1]);
    }

    public String translate(String input) {
        String[] words = input.split(" ");
        String output = "";
        for (String x : words)
            for (Map.Entry<String, String> entry : pairs.entrySet())
                if (x.equals(entry.getKey()))
                    output += entry.getValue() + " ";

        return output;
    }

    public String toString() {
        return pairs.toString().replaceAll("\\,", "\n");
    }
}