package demo2;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	int r, sum=0 , temp;
	System.out.println("enter the number?");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	temp = n;
	while(n>0){
	r= n%10;
	n= n/10;
	sum= sum*10+r;
	
	}	
	if(temp== sum)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
}

}
