package com.leetcode;

public class Solution2 {
	public int[] twoSum(int[] nums, int target) {
		int[] index = new int[2];
		int k = 0;

		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					if(i!=j) {
						index[k] = i;
						index[k + 1] = j;
	
					}
									}
			}

		}
		return index;
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] arr = { 3,2, 3 };
		System.out.println(solution.twoSum(arr, 6));
	}
}
