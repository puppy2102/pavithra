package Pro;

import java.util.Scanner;

public class Numbeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int m;
			System.out.println("Enter total no of values in the array");
			Scanner s=new Scanner(System.in);
			m=s.nextInt();
			int a[]=new int[m];
			for(int i=0;i<m;i++)
			a[i]=s.nextInt();
			for(int i=1;i<m;i++)
			{
			  for(int j=0;j<i;j++)
			  {
			    if(a[j]==a[i])
			    System.out.println(a[j]+"");
			    break;
			  }
			  break;
			}
			}
			}

	}


