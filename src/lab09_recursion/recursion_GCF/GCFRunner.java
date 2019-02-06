//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lab09_recursion.recursion_GCF;

import java.util.*;

import static java.lang.System.*;

public class GCFRunner {
    public static void main(String args[]) {
        System.out.println(
                "" + GCF.gcf(16, 256) + "\n" +

                        GCF.gcf(1000, 2000) + "\n" +

                        GCF.gcf(1254, 2546) + "\n" +

                        GCF.gcf(214, 356) + "\n" +

                        GCF.gcf(90, 99) + "\n" +

                        GCF.gcf(21, 28) + "\n" +

                        GCF.gcf(55, 5) + "\n" +

                        GCF.gcf(315, 211)
        );
    }
}