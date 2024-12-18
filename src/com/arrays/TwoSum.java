package com.arrays;

import com.exceptions.TwoSumException;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for (int j=1; j< nums.length-1; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        throw new TwoSumException("No sum present in given array");
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if (resultMap.containsKey(difference)) {
                return new int[]{resultMap.get(difference), i};
            }
            resultMap.put(nums[i], i);
        }
        throw new TwoSumException("No sum present for given target");
    }
}
