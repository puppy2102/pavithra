package Guvi;

import java.util.Scanner;

public class FF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=str.toLowerCase();
		int n=str1.length();
		int i;
		int flag=0,flag1=0;
		if(n%2==1){
			System.out.println("Not balanced");
		}
		if(n%2==0){
		for(i=0;i<n;i++){
			char ch1=str1.charAt(i);
			
			if((ch1>='a'||ch1<='m')){
					flag+=1;
				
				}
			else if((ch1>='n'||ch1<='z')) {
					flag1+=1;
					
				}
		}
		if(flag==flag1){
			System.out.println("balanced");
		}
		if(flag!=flag1){
			System.out.println("Not balanced");
		}
		}

	}


	
}
