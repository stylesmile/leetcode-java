package com.example.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author chenye
 */
public class leetcode01 {


    /**
     * 方式一
     */
    public static void twoSum(int[] numbers, int targert) {
        int numberslength = numbers.length;
        Map map = new HashMap<>(numberslength);
        for (int i = 0; i < numberslength; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numberslength; i++) {
            int complement = targert - numbers[i];
            if (map.containsKey(complement)) {
                System.out.println(i + "," + map.get(complement));
                map.remove(numbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 3, 4, 5, 6}, 7);
    }
}
