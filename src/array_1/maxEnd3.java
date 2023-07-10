package array_1;

public class maxEnd3 {

    public int[] maxEnd3(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[0] > nums[nums.length-1]){
                result[i] = nums[0];
            }else{
                result[i] = nums[nums.length-1];
            }

        }

        return result;

    }


}
/*
Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */