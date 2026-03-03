//1. Given an integer array nums of length n and an integer target, find three integers at
//        distinct indices in nums such that the sum is closest to target.
//        Return the sum of the three integers.
//        You may assume that each input would have exactly one solution.
//        Example 1:
//        Input: nums = [-1,2,1,-4], target = 1
//        Output: 2
//        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//        Example 2:
//        Input: nums = [0,0,0], target = 1
//        Output: 0
//        Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

package Biweekly1;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int findClosest(int[] nums, int target){
        Arrays.sort(nums);

        int closest = nums[0] + nums[1]+ nums[2];

        for(int i=0; i<nums.length - 2; i++){

            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int currSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(currSum -target) < Math.abs(closest - target)){
                    closest = currSum;
                }
                if(currSum < target){
                    left ++;
                }
                else{
                    right --;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,1,2};
        int target = 1;
        int[] arr1 = {1,2,4,8};
        int target1 = 6;
        int[] arr2 = {0,0,0};
        int target2 = 5;
        System.out.println(findClosest(arr, target));
        System.out.println(findClosest(arr1, target1));
        System.out.println(findClosest(arr2, target2));

    }

}
