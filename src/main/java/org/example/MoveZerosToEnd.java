package org.example;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] a = new int[] {0,1,0,3,12};
        solution2(a);
    }

    public static void solution1(int[] nums) {
        int nonZeroEndIndex=setNonZeroEndIndex(nums);

        for (int i=nonZeroEndIndex; i>=0; i--) {
            if (nums[i] == 0) {
                if (i < nonZeroEndIndex) {
                    nonZeroEndIndex = moveZeroToEnd(nums, nonZeroEndIndex, i);
                }
            }
        }
        for (int i=0; i<nums.length; i++)
            System.out.println(nums[i]);
    }

    private static int setNonZeroEndIndex(int[] nums) {
        for (int i=nums.length-1; i>0; i--) {
            if (nums[i] != 0)
                return i;
        }
        return 0;
    }

    private static int moveZeroToEnd(int[] nums, int nonZeroEndIndex, int currentIndex) {
        for (int i=currentIndex; i<nonZeroEndIndex; i++) {
            nums[i] = nums[i+1];
            nums[i+1] = 0;
        }
        return nonZeroEndIndex--;
    }

    public static void solution2(int[] nums) {
        if (nums == null || nums.length==0 || nums.length==1)
            return;

        int nonZeroPointer=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroPointer];
                nums[nonZeroPointer] = temp;
                nonZeroPointer++;
            }
        }

        for (int i=0; i<nums.length; i++)
            System.out.println(nums[i]);
    }
}
