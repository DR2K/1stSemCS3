package lab03_maps;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.*;

public class Acronyms {
    private Map<String, String> acronymTable;

    public Acronyms() {
        acronymTable = new TreeMap<>();
    }

    public void putEntry(String entry) {
        String[] personRelative = entry.split(" - ");
        acronymTable.put(personRelative[0], personRelative[1]);
    }

    public String convert(String sent) {
        String[] msg = sent.split(" ");
        String output = "";
        for (String x : msg) {
            boolean addVal = false;
            for (Map.Entry<String, String> entry : acronymTable.entrySet()) {
                if (x.equals(entry.getKey())) {
                    output += entry.getValue();
                    addVal = true;
                }
                else if (x.endsWith("."))
                    if (x.substring(0,x.length()-1).equals(entry.getKey())) {
                        output += entry.getValue();
                        addVal = true;
                        output+=".";
                    }
            }
            if (!addVal)
                output += x;
            output += " ";
        }

        return output;
    }

    public String toString() {
        return "";
    }
}