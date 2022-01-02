package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution8 {
	public boolean isPalindrome(int x) {
		if(x<0)
		{
			return false;
		}
	
		int y=x;
		
		List<Integer> list=new ArrayList<>();
		int rev=0;
		while(x !=0) {
			int pop = x % 10;
			x /= 10;
			rev = rev * 10 + pop;
			System.out.println(x);
		}
		if(y==x) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
