package com.baiyan.chapter02;

import java.util.Comparator;

/**
 * @Auther: peilongcheng
 * @Date: 2019/5/13 15:43
 * @Description: 选择排序：每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到全部待排序的数据元素排完。
 */
public class SelectionSort {

    //按照升序排序
    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            //注意这里操作索引而不是对应的值
            int min=i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min=j;
                }
            }
            exec(list, i, min);
        }

    }

    public static void exec(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }

    public static void main(String[] args){
        int[] list={12,313,12,145,124,13,121,3,1,22,44,12,5,6,23,664,22,34};
        SelectionSort.sort(list);
        for(int x:list){
            System.out.print(x+" ");
        }
    }

}
