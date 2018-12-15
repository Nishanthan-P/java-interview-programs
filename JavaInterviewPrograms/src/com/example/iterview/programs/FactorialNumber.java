package com.example.iterview.programs;

public class FactorialNumber {
	
	public static void main(String[] args) {
		int n=5;
		int f = 1;
		for(int i=n;i>0;i--){
			f=f*i;
		}
		System.out.println(f);
	}
}
