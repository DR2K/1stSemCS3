package lab07_sets;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Lab07b {
    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("/Users/devdeeprajpal/IdeaProjects/1st9WeeksCS3/src/lab07_sets/lab07b.dat"));
        while (file.hasNext()) {
            String sent = file.nextLine();
            OddEvenSets test = new OddEvenSets(sent);
            out.println(test);
        }

    }
}