package com.example.iterview.programs;

public class Palindrome {

	public static void main(String[] args) {
		String palindrome = "locaol";
		String reverse = "";
		for(int i = palindrome.length()-1; i >= 0 ; i--){
			reverse = reverse + palindrome.charAt(i);
		}
		System.out.println(reverse);
		if(palindrome.equals(reverse)){
			System.out.println("Its Palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}
	
}
