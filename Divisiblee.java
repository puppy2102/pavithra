package Pro;

import java.util.Scanner;

public class Divisiblee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int n1=sc.nextInt();
	        int[] n=new int[20];
	        for(int i=0;i<n1;i++)
	        {
	            n[i]=sc.nextInt();
	        }
	        if(n1%2==0)
	        {
	            System.out.println("proper array");
	        }
	        else
	        {
	            System.out.println("not proper array");
	        }
	}

}
