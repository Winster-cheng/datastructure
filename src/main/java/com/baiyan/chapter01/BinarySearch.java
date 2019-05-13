package com.baiyan.chapter01;

import java.util.Arrays;

/**
 * @Auther: peilongcheng
 * @Date: 2019/4/19 09:58
 * @Description: 二分查找
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        //检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = {131, 94, 120, 10, 84, 32, 91, 49, 23, 11, 9, 313, 2, 145, 467, 43, 235};
        Arrays.sort(whitelist);
        int key = 94;
        int result = rank(key, whitelist);
        if (result < 0) {
            System.out.println("未找到 " + key);
        } else {
            System.out.println("二分查找结果是" + rank(key, whitelist));
        }

    }
}
