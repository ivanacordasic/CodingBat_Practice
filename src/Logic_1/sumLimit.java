package Logic_1;

public class sumLimit {

    public int sumLimit(int a, int b) {
        String result = String.valueOf(a);
        int length = result.length();

        int sum = a+b;
        String result2 = String.valueOf(sum);
        int sumLength = result2.length();

        if(length == sumLength || length > sumLength){
            return sum;
        }

        return a;
    }


}
/*

Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
 */