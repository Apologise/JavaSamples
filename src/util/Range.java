package util;

import static util.Print.*;

public class Range {
	public static int[] range(int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; ++i) {
			result[i] = i;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i:range(11)) {
			print(i);
		}
		int[] test = {1,2,3,4};
	}

}
