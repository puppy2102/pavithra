package Player;

import java.util.Scanner;

public class Summa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int count=0,n1,n2;
	        for(int i=1;i<=n;i++)
	        {
	            n1=i;
	            while(n1!=0)
	            {
	             n2=n1%10;   
	            if(n2==2)
	            {
	                count++;
	            }
	            n1=n1/10;
	            }
	        }System.out.println(" "+count);
	}

}
