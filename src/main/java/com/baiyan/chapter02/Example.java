package com.baiyan.chapter02;

/**
 * @Auther: peilongcheng
 * @Date: 2019/5/13 11:57
 * @Description: 这是排序类的模版，后续的排序方法主要重写Example类的sort方法
 */
public class Example {
    public static void sort(Comparable[] a) {
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static boolean isSorted(Comparable[] a) {
        //判断数组是否有序
        for (int i = 1; i < a.length; i++) {
            return  !less(a[i], a[i - 1]);
        }
        return true;
    }

    public static void main(String[] args){
        //从标准输入法中读取字符串，将它们排序并且输出
        String a[]={"a","c","d","g","e","b","m","k","b"};
        sort(a);
        show(a);
    }
}

