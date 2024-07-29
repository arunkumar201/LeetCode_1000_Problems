class Solution {
	public boolean canAliceWin(int[] nums) {
		int aliceSingleDigitSum = 0;
		int totalSum = 0;
		for (int num : nums) {
			totalSum += num;
			if (num < 10) {
				aliceSingleDigitSum += num;
			}
		}
		int aliceDoubleDigitSum = totalSum - aliceSingleDigitSum;
		return Math.max(aliceSingleDigitSum, aliceDoubleDigitSum) > totalSum / 2;
	}
}