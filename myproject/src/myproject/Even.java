package myproject;

import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number you want to check:");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Given number "+n+" is even");
		}
		else
		{
			System.out.println("Given number "+n+" is odd");
		}

	}

}
