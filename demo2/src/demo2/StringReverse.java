package demo2;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc =new Scanner(System.in);
		String name = sc.next();
		String reverse ="";
		int l=name.length();
		for(int i=l-1;i>=0;i--){
			reverse= reverse+name.charAt(i);
		}
		System.out.println(reverse);
		System.out.println();
		
	}

}
