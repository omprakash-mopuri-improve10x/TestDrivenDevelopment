package omprakash.tdd.warofnumbers;

public class War {

    public int warOfNumbers(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            result = -1;
        } else {
            int sumOfEvenNums = 0, sumOfOddNums = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    sumOfEvenNums += nums[i];
                } else {
                    sumOfOddNums += nums[i];
                }
            }
            result = sumOfEvenNums > sumOfOddNums ? sumOfEvenNums - sumOfOddNums : sumOfOddNums - sumOfEvenNums;
        }
        return result;
    }
}
