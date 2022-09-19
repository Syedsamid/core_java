import java.io.*;
import java.lang.*;

class lable
{
	public static void main(String args[])
	{
	int i,j;
	outer:
		  for(i=0;i<=2;i++)
		   {
	inner: 
	      for(j=0;j<=2;j++)
		  {
			System.out.print(j);
			if(j==1)
			{
				System.out.println("the value of j is ="+j);
				//break outer;
				//goto outer;
			}
		  }
		   }
	}
	
}