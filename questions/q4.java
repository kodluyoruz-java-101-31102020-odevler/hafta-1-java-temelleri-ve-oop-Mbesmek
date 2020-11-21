package questions;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the star layer ");
		int n=scan.nextInt();
		
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<i;j++) {				
					System.out.print("*");
				
				
			}
			System.out.print("\n");
		}
		scan.close();
	}

}
