package hylema.tasks.easy;

import java.util.Arrays;

/**
 * url https://leetcode.com/problems/squares-of-a-sorted-array/description/
 * title 977. Квадраты отсортированного массива
 */
public class ID977 {

    public static int[] run(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}
