package questions;

import java.util.Random;

public class q3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int arr[]= new int[10];
		
		for (int i = 0; i < arr.length; i++)
		    {
		        arr[i]=(rand.nextInt(1000));
		      
		    }
		double avarage=avarage(arr);
		System.out.print("Result:"+ avarage);
				
	}
	
	public static double avarage(int arr[]) {
		double sum =0;
		for (int i = 0; i < arr.length; i++)
	    {
	       sum=sum+ arr[i];
	      
	    }

		return (sum/arr.length);
	}

}
