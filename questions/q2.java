package questions;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter 2 number\n");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		System.out.print("Enter operation \n");
		System.out.print("You can select \n 1) +\n 2) - \n 3) * \n 4) /");
		Scanner scan2=new Scanner(System.in);
		String opt=scan2.nextLine();
		
		switch(opt) {
		case "+":
			System.out.print("Result:"+ num1+num2);
			break;
		case "-":
			System.out.print("Result:"+ (num1-num2));
			break;
		case "*":
			System.out.print("Result:"+ (num1*num2));
			break;
		case "/":
			System.out.print("Result:"+ (num1/num2));
			break;
			default:
				System.out.print("İncorrect opt");
		}
		
	
		scan.close();
		scan2.close();
	}

}
