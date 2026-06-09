class Solution {

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {

            if (currSum <= 0) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum += nums[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        return maxSum;
    }
}