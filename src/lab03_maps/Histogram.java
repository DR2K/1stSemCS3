//(c) A+ Computer Science
//www.apluscompsci.com
package lab03_maps;

//Name -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class Histogram {
    private Map<String, Integer> histogram;

    public Histogram() {
        histogram = new TreeMap<>();
    }

    public Histogram(String sent) {
        histogram = new TreeMap<>();
        setSentence(sent);
    }

    public void setSentence(String sent) {
        histogram.clear();
        String[] words = sent.split(" ");
        for (String x : words) {
            if (histogram.get(x) == null)
                histogram.put(x, 1);
            else
                histogram.put(x, histogram.get(x) + 1);
        }

    }

    public String toString() {
        String output = "char    1---5----01---5";
        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            output += "\n" + entry.getKey() + "    ";
            for (int x = 0; x < entry.getValue(); x++)
                output += "*";
        }

        return output + "\n\n";
    }
}