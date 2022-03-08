package myproject;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur option");
		x = sc.nextInt();
		switch(x)
		{
		case 0:
			System.out.println("0");
			break;
			
		case 1:
			System.out.println("1");
			break;
		
		case 2:
			System.out.println("2");
			break;
			
		default:
			System.out.println("default statement");
		
			
			
		}
		
		

	}

}
