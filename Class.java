package Pro;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=123;
		int p=s;
		int r=0,q=1;
		while(s!=0)
		{
		r=s%10;
		q=q*r;
		s=s/10;
		}
		q=p*q;
		System.out.println(q);
		
	}

}
	


