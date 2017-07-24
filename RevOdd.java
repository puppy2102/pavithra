package Player;

import java.util.Scanner;

public class RevOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2[]=str1.split("\\s");
      
        for(int i=0;i<str1.length()-1;i=i+2)
        {
            String str3=new StringBuffer(str2[i]).reverse().toString();
            System.out.print(" "+str3);
            
        }
	}

}
