package pavi;
import java.util.*;
public class Hunter1 {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			String s[]=new String[n];
			for(int i=0;i<n;i++){
				s[i]=scan.next();
			}
			for(int i=n-1;i>=0;i--){
				System.out.print(s[i]+" ");
			}

		}

	}

