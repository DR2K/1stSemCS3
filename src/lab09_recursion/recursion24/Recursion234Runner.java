//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -
package lab09_recursion.recursion24;

import static java.lang.System.*;

public class Recursion234Runner {
    public static void main(String args[]) {
        out.println(
                "one:\n" +
                        RecursionFunOne.countOddDigits(4532) + "\n" +
                        RecursionFunOne.countOddDigits(1114532) + "\n" +
                        RecursionFunOne.countOddDigits(2245327) + "\n" +
                        RecursionFunOne.countOddDigits(2468) + "\n" +
                        RecursionFunOne.countOddDigits(13579) + "\n" +

                        "two:\n" +
                        RecursionFunTwo.countChickens("itatfun") + "\n" +
                        RecursionFunTwo.countChickens("itatchickenfun") + "\n" +
                        RecursionFunTwo.countChickens("chchickchickenenicken") + "\n" +
                        RecursionFunTwo.countChickens("chickchickfun") + "\n" +
                        RecursionFunTwo.countChickens("chickenbouncetheballchicken") + "\n" +

                        "three:\n" +
                        RecursionFunThree.luckySevens(1087171) + "\n" +
                        RecursionFunThree.luckySevens(1077171) + "\n" +
                        RecursionFunThree.luckySevens(77077) + "\n" +
                        RecursionFunThree.luckySevens(97171771707797L) + "\n" +
                        RecursionFunThree.luckySevens(1089651234)
        );
    }
}