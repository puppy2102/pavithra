package Pro;

import java.util.Scanner;

public class Prefixx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the first string : ");
			String str = sc.nextLine();

			System.out.println("Enter the second string : ");
			String str1 = sc.nextLine();

			if (str.charAt(0) != str1.charAt(0)) {
			  System.out.println(""+str+ " and "+str1+ " have no common prefix");
			  System.exit(0);
			    }

			for(int i=0;i<str.length()-1;i++){
				if(str.charAt(i)==str1.charAt(i)){
					System.out.print(str.charAt(i));
				}
			}
			
			}
			}
	

}
