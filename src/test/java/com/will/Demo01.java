package com.will;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 *  
 * <p>
 * 示例 Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)]
 * 解释：因为 nums[0] + nums[Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)] == 9 ，返回 [0, Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO),2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,Java中常见的对象类型简述(DO、BO、DTO、VO、AO、PO)]
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5};
        int target = 8;

        int[] ints = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && i!=j) {
//                    System.out.println(i+" "+j);
                    ints[0] = i;
                    ints[1] = j;
                    break;
                }
            }

        }

    }
}
