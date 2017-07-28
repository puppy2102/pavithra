package Player;

import java.util.Scanner;

public class Stringgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String str=sc.next();
	        char[] ch=str.toCharArray();
	        int j=str.length();
	        for(int i=0;i<j;i++)
	        {
	            if(ch[i]!=ch[j-1])
	            {
	                System.out.print(ch[i]+" "+ch[(j-1)-i]+" "); 
	            }
	        }
	}

}
