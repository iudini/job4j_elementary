package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp[i] = nums[nums.length - 1];
            } else {
                temp[i] = nums[i - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
