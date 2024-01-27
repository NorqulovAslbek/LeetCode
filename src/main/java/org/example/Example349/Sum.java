package org.example.Example349;

import java.lang.reflect.Array;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean b = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    b = true;
                }
                if (b) {
                    break;
                }

            }
        }
        int[] newArr = new int[set.size()];
        int index=0;
        for (Integer i : set) {
            newArr[index]=i;
            index++;
        }
        System.out.println(Arrays.toString(newArr));

    }
}
