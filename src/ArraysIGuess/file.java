package ArraysIGuess;

public class file {

    public static void main(String[] args) {
        String[] oddNumber = {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"};
        String[] oddNumberFalse = {"alpha", "beta", "gama", "delta", "gamma", "beta", "alpha"};
        String[] evenNumber = {"alpha", "beta", "gamma", "gamma", "beta", "alpha"};
        String[] evenNumberFalse = {"alha", "beta", "gamma", "gamma", "beta", "alpha"};
        String[] oddNumberNumeric = {"alpha11", "beta22", "gamma33", "delt4a", "gamma33", "beta22", "alpha11"};
        String[] oddNumberNumericFalse = {"alpha121", "beta22", "gamma33", "delt4a", "gamma33", "beta22", "alpha11"};
        String[] mixedCase = {"aLpHa121", "BeTa22", "gaMMa33", "deLt4a", "gamma33", "beta22", "alpha11"};
        String[] mixedCaseFalse = {"aLpHa121", "BeTa22", "gaMMa33", "deLt4a", "gamma33", "beta22", "alpha11"};
        String[] oneVal = {"alpha"};
        String[] zeroVal = {};

        System.out.println(isPalindrome(oddNumber) + "  oddNumber");
        System.out.println(isPalindrome(oddNumberFalse) + "  oddNumberFalse");
        System.out.println(isPalindrome(evenNumber) + "  evenNumber");
        System.out.println(isPalindrome(evenNumberFalse) + "  evenNumberFalse");
        System.out.println(isPalindrome(oddNumberNumeric) + "  oddNumberNumeric");
        System.out.println(isPalindrome(oddNumberNumericFalse) + "  oddNumberNumericFalse");
        System.out.println(isPalindrome(mixedCase) + "  mixedCaseOdd");
        System.out.println(isPalindrome(mixedCaseFalse) + "  oddNumberNumericFalse");
        System.out.println(isPalindrome(oneVal) + " oneVal");
        System.out.println(isPalindrome(zeroVal) + "  zeroVal");
    }

    public static boolean isPalindrome(String[] vals) {
        if (vals.length == 0)
            return true;
        for (int x = 0; x < vals.length / 2; x++)
            if (!(vals[x].toLowerCase().equals(vals[vals.length - 1 - x].toLowerCase())))
                return false;
        return true;
    }
}