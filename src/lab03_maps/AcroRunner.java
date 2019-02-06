//(c) A+ Computer Science
//www.apluscompsci.com
package lab03_maps;

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class AcroRunner {
    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("/Users/devdeeprajpal/IdeaProjects/1st9WeeksCS3/src/lab03_maps/acro.dat"));
        Acronyms test = new Acronyms();
        int limit = Integer.parseInt(file.nextLine());
        int counter = 0;
        while (file.hasNext() && limit > counter) {
            String sent = file.nextLine();
            test.putEntry(sent);
            counter++;
        }
        out.println(test.toString());
        while (file.hasNext()) {
            out.println(test.convert(file.nextLine()));
        }
    }
}