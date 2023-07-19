package omprakash.tdd.maximumgap;

public class MaximumGap {

    public int getMaxGap(int[] nums) {
        int maxGap = 0;
        if (nums == null || nums.length <= 1) {
            maxGap = -1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                int gap = nums[i] > nums[i + 1] ? nums[i] - nums[i + 1]: nums[i + 1] - nums[i];
                if (gap > maxGap) {
                    maxGap = gap;
                }
            }
        }
        return maxGap;
    }
}
