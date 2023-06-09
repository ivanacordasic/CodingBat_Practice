package logic_1;

public class TwoAsOne {

    public boolean twoAsOne(int a, int b, int c) {
        a= Math.abs(a);
        b= Math.abs(b);
        c= Math.abs(c);

        return (a+b <= c || a+c<=b ||b+c<=a);
    }

}
/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */