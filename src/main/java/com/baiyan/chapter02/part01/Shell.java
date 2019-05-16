package com.baiyan.chapter02.part01;

/**
 * @Auther: peilongcheng
 * @Date: 2019/5/16 15:43
 * @Description: 希尔排序
 */
public class Shell {

    //按照升序排序
    public static void sort(int[] list) {
        int increment = 1;
        while (increment < list.length / 3) {
            increment = 3 * increment + 1;
        }
        do {
            //每隔increment个数据为一组进行插入排序
            for (int i = increment; i < list.length; i++) {
                for (int j = i; j >= increment; j -= increment) {
                    if (list[j] < list[j - increment]) {
                        exec(list, j, j - increment);
                    }
                }
            }
            increment = increment / 3+1;
        } while (increment >1);
    }

    public static void exec(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }

    public static void main(String[] args) {
        int[] list = {12, 313,  145, 124, 13, 121, 3, 1, 22, 44, 12, 5, 6, 23, 664, 22, 34};
        SelectionSort.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

}
