package com.will.sort;

import java.util.Arrays;

/**
 * 选择排序（Selection sort）是一种简单直观的排序算法。
 * <p>
 * 它的工作原理如下:
 * 首先在未排序序列中找到最小（大）元素，
 * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 * <p>
 * 选择排序的主要优点与数据移动有关。如果某个元素位于正确的最终位置上，则它不会被移动。
 * 选择排序每次交换一对元素，它们当中至少有一个将被移到其最终位置上，因此对n个元素的表进行排序总共进行至多(n-Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO))次交换。
 * 在所有的完全依靠交换去移动元素的排序方法中，选择排序属于非常好的一种。
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 7, 4, 6, 3, 8, 2, 5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[j + 1]) {

                }
            }
        }
        return new int[10];
    }
}
