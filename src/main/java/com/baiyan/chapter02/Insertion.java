package com.baiyan.chapter02;

/**
 * @Auther: peilongcheng
 * @Date: 2019/5/16 15:28
 * @Description:
 */
public class Insertion {

    //按照升序排序
    public static void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for(int j=i;j>0;j--){
                if(list[j]<list[j-1]){
                    exec(list,j,j-1);
                }
            }
        }
    }

    public static void exec(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }

    public static void main(String[] args) {
        int[] list = {12, 313, 12, 145, 124, 13, 121, 3, 1, 22, 44, 12, 5, 6, 23, 664, 22, 34};
        SelectionSort.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
