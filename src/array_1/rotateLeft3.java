package array_1;

import java.util.Arrays;

public class rotateLeft3 {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(rotateLeft3(nums)));

    }

    public static int[] rotateLeft3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + (nums.length - 1)) % nums.length] = nums[i];
        }
        return result;
    }


}
/*

Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5
 */