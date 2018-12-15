package com.example.iterview.programs;

public class CheckPrimeNumber {
	
	public void checkPrime(int num){
		int m = num/2;
		if(num==0 || num==1){
			System.out.println("Not prime number");
		}
		for(int i=2;i<=m;i++){
			if(i%2==0){
				System.out.println("not prime num");
				break;
			}else{
				System.out.println("prime num");
			}
		}
	}

	public static void main(String[] args) {
		CheckPrimeNumber ob = new CheckPrimeNumber();
		ob.checkPrime(23);
	}
}
