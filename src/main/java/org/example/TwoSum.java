package org.example;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int a[] = new int[] {1,2,7,8,11,15};
        int[] result = twoSum(a, 9);
        for (int i=0; i< result.length; i++)
            System.out.println(result[i]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int startIndex=0;
        int endIndex=nums.length-1;

        while (startIndex<endIndex) {
            int sum = nums[startIndex] + nums[endIndex];
            if (sum == target) {
                return new int[] {nums[startIndex], nums[endIndex]};
            }
            else if (sum > target)
                endIndex -= 1;
            else
                startIndex += 1;
        }

        return new int[] {-1, -1};
    }

}
