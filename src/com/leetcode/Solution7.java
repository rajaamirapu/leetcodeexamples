package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution7 {
public int reverse(int x) {
	List<Integer> list=new ArrayList<>();
	int rev=0;
	while(x !=0) {
		int pop = x % 10;
		x /= 10;
	
		if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
		if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
		rev = rev * 10 + pop;
		System.out.println(x);
	}
	
	return rev;
}
public static void main(String[] args) {
	Solution7  solution=new Solution7();
	solution.reverse(123);
}
}
