package Pro;

public class Checkerr {


		// TODO Auto-generated method stub
		static int c;
		static String getstring(String input)
		{
			String str=input;
			str=str.toLowerCase();
			String[] x=str.split("");
			String s="abcdefghijklmnopqrstuvwxyz";
			String[] y=s.split("");
			for(int i=0;i<y.length;i++)
			{
				for(int j=0;j<x.length;j++)
				{
					if(y[i].equals(x[j]))
					{
						c++;
						break;
					}
					else
					{
						continue;
					}
				}
			}
			if(c==26)
			{
				return " Pangram";
			}
			else {
				return "Not A pangram";
			}
		}
		public static void main(String[] args) {
			System.out.println(getstring("wertyuiop567sadfghjklzxcvbnmq"));
		}
		}