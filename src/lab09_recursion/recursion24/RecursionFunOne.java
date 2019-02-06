//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package lab09_recursion.recursion24;

import static java.lang.System.*;

public class RecursionFunOne {
    public static int countOddDigits(int num) {
        if (num > 0) {
            if (num % 2 == 1)
                return 1 + countOddDigits(num / 10);
            return countOddDigits(num / 10);
        }
        return 0;
    }
}