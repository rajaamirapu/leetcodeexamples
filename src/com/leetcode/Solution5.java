package com.leetcode;

import java.util.Arrays;
import java.util.List;

public class Solution5 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] nums3=new int[nums1.length+ nums2.length];
	for(int i=0;i<nums1.length;i++) {
		nums3[i]=nums1[i];
	}
		
	for(int i=0;i<nums2.length;i++) {
		nums3[nums1.length+i]=nums2[i];
	}
	int n=nums3.length;
	double m=0;
	Arrays.sort(nums3);
	if (n % 2 != 0)
         return (double)nums3[n / 2];

     return (double)(nums3[(n - 1) / 2] + nums3[n / 2]) / 2.0;
	

		
	}
	public static void main(String[] args) {
		int[] arr1= {1,2};
		int[] arr2= {3};
		Solution5 s=new Solution5();
	System.out.println(s.findMedianSortedArrays(arr1, arr2));	
				
		
	}
	
}
