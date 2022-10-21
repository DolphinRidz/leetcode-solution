package com.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsSubsequence392 {
/**
 * Subsequence 
 * https://www.geeksforgeeks.org/data-structures/string-subsequence-substring/#whatissubsequence
 * 
 * @param s parameter one
 * @param t parameter two
 * @return boolean
 */
	public static boolean isSubsequence(String s, String t) {
		List<Integer>[] idx = new List[256];
		for (int i = 0; i < t.length(); i++) {
			if (idx[t.charAt(i)] == null)
				idx[t.charAt(i)] = new ArrayList<>();
			idx[t.charAt(i)].add(i);
		}

		int prev = 0;
		for (int i = 0; i < s.length(); i++) {
			if (idx[s.charAt(i)] == null)
				return false;
			int j = Collections.binarySearch(idx[s.charAt(i)], prev);
			if (j < 0)
				j = -j - 1;
			if (j == idx[s.charAt(i)].size())
				return false;
			prev = idx[s.charAt(i)].get(j) + 1;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "abc", t = "ahbgdc";
	    //String s = "axc", t = "ahbgdc";

		boolean isSubsequence = isSubsequence(s, t);
		if (isSubsequence)
			System.out.print("String: " + s + " and String: " + t + " are isSubsequence");
		else
			System.out.print("String: " + s + " and String: " + t + " are not isSubsequence");

	}
}
