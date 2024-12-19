package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> numHash = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if(numHash.contains(nums[i])){
                return true;
            }
            numHash.add(nums[i]);
        }
        return false;
    }
}
