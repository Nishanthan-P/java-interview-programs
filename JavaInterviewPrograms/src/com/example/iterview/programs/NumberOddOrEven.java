package com.example.iterview.programs;

public class NumberOddOrEven {

	public int checkNum(int num){
		if(num%2==0){
			System.out.println("Number is even");
		}else{
			System.out.println("Number is odd");
		}
		return num;
	}
	
	public static void main(String[] args) {
		NumberOddOrEven obj = new NumberOddOrEven();
		int a = obj.checkNum(12);
		System.out.println(a);
	}
}
