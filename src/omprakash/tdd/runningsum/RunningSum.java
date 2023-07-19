package omprakash.tdd.runningsum;

public class RunningSum {

    public int[] getRunningSum(int[] nums) {
        int[] result;
        if (nums == null) {
            result = new int[0];
        } else {
            result = new int[nums.length];
            int sumOfNums = 0;
            for (int i = 0; i < nums.length; i++) {
                sumOfNums += nums[i];
                result[i] = sumOfNums;
            }
        }
        return result;
    }
}
