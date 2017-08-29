package Guvi;

import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int l=st.length();
        int[] no=new int[l];
        char[] ch=new char[l];
        ch=st.toCharArray();
        for(int i=0;i<l;i++)
        System.out.println(" "+ch[i]);
        int i,j,n;
        String sum="";
        for(i=0;i<l;i=i+2)
        {
            for(j=i+1;j<l;j=j+2)
            {
                no[i]=ch[j];
                n=no[i]-48;
                System.out.println(" "+ch[j]+" "+n);
               for(int k=n;k>0;k--){
                   sum=sum+ch[i];
               }
               break;
            }
        }
         System.out.println("4 "+sum);
    }

	}


