//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package lab09_recursion.recursion24;

import static java.lang.System.*;

public class RecursionFunTwo {
    public static int countChickens(String word) {
        if (word.contains("chicken"))
            return 1 + countChickens(word.substring(0, word.indexOf("chicken")) + word.substring(word.indexOf("chicken") + 7));
        return 0;
    }
}