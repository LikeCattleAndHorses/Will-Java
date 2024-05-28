package com.will.sort;

import java.util.Arrays;

/**
 * 冒泡排序（英语：Bubble Sort）又称为泡式排序，是一种简单的排序算法。
 * 它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * <p>
 * 冒泡排序算法的运作如下：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 7, 4, 6, 3, 8, 2, 5};
        System.out.println(Arrays.toString(sort(arr)));


        int[] arr1 = {1, 9, 0, 7, 4, 6, 3, 8, 2, 5};
        System.out.println(Arrays.toString(bubbleSort(arr1)));
    }

    public static int[] sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean Flag = false; // 是否发生交换。没有交换，提前跳出外层循环
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    Flag = true;
                }
            }
            if (!Flag) {
                break;
            }
        }
        return array;
    }
}
