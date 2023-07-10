package array_1;

import java.util.Arrays;

public class reverse3 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse3(nums)));

    }


    public static int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        int j = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result[j-1] = nums[i];
            j = j-1;

        }
        return result;
    }


}
/*

Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */