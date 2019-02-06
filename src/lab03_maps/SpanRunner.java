//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package lab03_maps;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class SpanRunner {
    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("/Users/devdeeprajpal/IdeaProjects/1st9WeeksCS3/src/lab03_maps/spantoeng.dat"));
        SpanishToEnglish test = new SpanishToEnglish();
        int limit = Integer.parseInt(file.nextLine());
        int counter = 0;
        while (file.hasNext() && limit > counter) {
            String sent = file.nextLine();
            test.putEntry(sent);
            counter++;
        }
        out.println(test.toString());
        while (file.hasNext()) {
            out.println(test.translate(file.nextLine()));
        }
    }
}