package Player;

import java.util.Scanner;

public class DiffDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int l=-111;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int temp;
		int index1=0;
		for(i=0;i<n-1;i++){
			temp=arr[i]-arr[i+1];
			temp=Math.abs(temp);
			if(temp>l)
			{
				l=temp;
				index1=i;
			}
		}	
		System.out.println(index1);
		
	}

	}