package Guvi;
import java.util.Scanner;
public class Primerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
				int count=0;
				int a=sc.nextInt();
				int b=sc.nextInt();
			
				for(int i=a;i<=b;i++){
			count=0;
					
					for( int n=1;n<=i;n++){
						if(i%n==0){
							count++;
						}
						if(count==2){
							System.out.println(i);
							break;

			}

				}
			}
			}
		}

	}

}
