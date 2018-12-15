package com.example.iterview.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		System.out.println(first + "\n"+second);
		int sum = 0;
		int total = 10;
		for(int i=2;i<=total;i++){
			sum = first+second;
			System.out.println(sum);
			first = second;
			second = sum;
		}
	}
}
