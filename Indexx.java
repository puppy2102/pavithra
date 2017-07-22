package Pro;

import java.util.Scanner;

public class Indexx {

	
		 static Scanner input1=new Scanner(System.in);
	     int findEqual(int n){
	    	 int[] number=new int[100];
	    	 int i,result=0;
	    	 System.out.println("Enter the array elements:");
	    		for(i=0;i<n;i++){
	    		number[i]=input1.nextInt();
	    		if(number[i]==i)
	    		result=i;
	    		}
	    		input1.close();
	    		System.out.printf("The number %d equals its index %d",result,result);
	  
	    	 return result;
	     }

		public static void main(String[] args) {
		
		int p;
		System.out.println("Enter the array size:");
		p=input1.nextInt();
		Indexx output=new Indexx();
		output.findEqual(p);

		}

	}
