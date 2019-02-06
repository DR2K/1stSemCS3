package lab07_sets;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Lab07c {
    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("/Users/devdeeprajpal/IdeaProjects/1st9WeeksCS3/src/lab07_sets/lab07c.dat"));
        while (file.hasNext()) {
            String one = file.nextLine();
            String two = file.nextLine();
            MathSet mSet = new MathSet(one, two);
            System.out.println(mSet);
            System.out.println("union - " + mSet.union());
            System.out.println("intersection - " + mSet.intersection());
            System.out.println("difference A-B - " + mSet.differenceAMinusB());
            System.out.println("difference B-A - " + mSet.differenceBMinusA());
            System.out.println("symmetric difference " + mSet.symmetricDifference() + "\n\n");
        }
    }
}
