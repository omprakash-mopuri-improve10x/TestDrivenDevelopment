package omprakash.scoring.secondlargest;

public class SecondLargest {

    public int getSecondLargest(int[] nums) throws InvalidInputException {
        int secondLargest = Integer.MIN_VALUE;
        if (nums.length > 1) {
            int largest = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > largest) {
                    secondLargest = largest;
                    largest = nums[i];
                } else if (nums[i] > secondLargest && nums[i] < largest) {
                    secondLargest = nums[i];
                }
            }
        } else {
            throw new InvalidInputException();
        }
        return secondLargest;
    }
}