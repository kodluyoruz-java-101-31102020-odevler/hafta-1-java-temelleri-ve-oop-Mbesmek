package questions;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter password\n");
		String pswd= scan.next();
		scan.close();
		if(pswd.equals("1234"))
			System.out.print("Giriş Başarılı!");
		else
			System.out.print("Giriş Başarısız");
	}

}
