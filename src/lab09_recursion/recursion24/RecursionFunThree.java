//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package lab09_recursion.recursion24;

public class RecursionFunThree {
    /* luckySevens will return a count of the 7s in the number
     *    unless the 7s are side by side in which case they are worth 14
     *
     * 1087171  would return 2 as there are 2 7s
     * 1077171  would return 15 as 2 7s side by side count as 14 + 1 = 15
     * 77077  would return 28 ( 14 + 14 )
     * 97171771707797 would return 32 ( 1 + 1 + 14 + 1 + 14 + 1 )
     * 1089651234 would return 0
     *
     * the solution to this problem must use recursion
     */
    public static int luckySevens(long number) {
        if (number % 100 == 77)
            return luckySevens(number / 100) + 2;
        else if (number % 10 == 7)
            return luckySevens(number / 10) + 1;
        else if (number == 0)
            return 0;
        return luckySevens(number / 10);
    }
}