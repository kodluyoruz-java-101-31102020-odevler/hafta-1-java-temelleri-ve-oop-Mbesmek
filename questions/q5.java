package questions;

import java.util.Random;

public class q5 {
	public static void main(String[] args) {
		Random rand = new Random();
		int arr[]= new int[100];
		
		for (int i = 0; i < arr.length; i++)
		    {
		        arr[i]=(rand.nextInt(1000));
		      
		    }
		int arro[]=findOdd(arr);
		int arre[]=findEven(arr);
		
				
	}
	
	public static int[] findOdd(int arr[]) {
		int arro[]= new int[100];	
		int odd=0;
		for (int i = 0; i < arr.length; i++)
	    {
	      if(!(arr[i]%2==0)) {
	    	  arro[odd]=arr[i];
	    	odd++;  	     
	      }
	      
	    }

		return arro;
		}
		public static int[] findEven(int arr[]) {
			int arre[]= new int[100];	
			int even=0;
			for (int i = 0; i < arr.length; i++)
		    {
		      if(!(arr[i]%2==0)) {
		    	  arre[even]=arr[i];
		    	even++;  	     
		      }
		      
		    }

			return arre;
	}

}
