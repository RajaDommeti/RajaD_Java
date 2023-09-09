package com.glca.Streams;
import java.util.Arrays;

public class IntermediateOperators {

	public static void main(String[] args) {
		int[]nums= {1,2,3,4,5};
		int sum=Arrays.stream(nums).filter(n->n%2!=0).map(n->n*n).sum();
		System.out.println(sum);
	}
}

