//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package lab03_maps;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class PartList {
    private TreeMap<Part, Integer> partsMap;

    public PartList() {
        partsMap = new TreeMap<>();
    }

    public PartList(String fileName) {
        this();
        try {
            Scanner file = new Scanner(new File("/Users/devdeeprajpal/IdeaProjects/1st9WeeksCS3/src/lab03_maps/partinfo.dat"));
            while (file.hasNext()) {
                String sent = file.nextLine();
                if (partsMap.get(new Part(sent)) == null)
                    partsMap.put(new Part(sent), 0);
                partsMap.put(new Part(sent), partsMap.get(new Part(sent)) + 1);

            }
        } catch (IOException e)  //Most specific exceptions must be listed 1st
        {
            out.println(e);
        } catch (RuntimeException e) {
            out.println(e);
        } catch (Exception e) {
            out.println(e);
        } finally {
            //no code needed here
        }
    }

    public String toString() {
        String output = "";
        for (Map.Entry<Part, Integer> entry : partsMap.entrySet())
            output += entry.getKey().toString() + " - " + entry.getValue() + "\n";
        return output;
    }
}