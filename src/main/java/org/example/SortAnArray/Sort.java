package org.example.SortAnArray;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 8, 19,-1};

        for(int i=0 ; i<nums.length; i++){
            int minIndex=i;
            for(int j=i+1; j<nums.length ; j++){
                if(nums[minIndex]>nums[j]) {
                    minIndex=j;
                }
            }

            if(minIndex !=i){
                int temp=nums[i];
                nums[i]=nums[minIndex];
                nums[minIndex]=temp;
            }

        }
        System.out.println(Arrays.toString(nums));

    }
}