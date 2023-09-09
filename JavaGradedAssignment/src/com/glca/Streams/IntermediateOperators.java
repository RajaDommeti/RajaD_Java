package com.glca.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class IntermediateOperators
{
	public void operator()
	{
		List <Integer> num = Arrays.asList(1,2,3,4,5);
		Stream <Integer> numStream = num.stream();
		Stream <Integer> oddNum = numStream.filter(n->n%2!=0);
		Stream <Integer> squaredNum= oddNum.map(n->n*n);
		Integer sum = squaredNum.reduce(0,(m,n)->m+n);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		IntermediateOperators io = new IntermediateOperators();
		io.operator();

	}
}

