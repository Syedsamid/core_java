/*Bufferedreader
import java.io.*;
import java.lang.*;
class array1
{
	public static void main(String args[])
	{
		int a[][],b[][],ans[][],i,j;
		a=new int[10][10];
		b=new int[10][10];
		ans=new int[10][10];
		try
		{
			
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("\n\t Enter value of matrix 3*3");
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{					
					a[i][j]=Integer.parseInt(ob.readLine());
				}
			}
			
			System.out.println("\n\t Enter values of matrix3*3");
			for(i=1;i<=3;i++)
			{
				for (j=1;j<=3;j++)
				{
					b[i][j]=Integer.parseInt(ob.readLine());
				}
			}
			
			System.out.println("\n\tAddition of A and B:");
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{
					ans[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{
					System.out.print("\t"+ans[i][j]);
				}
				System.out.print("\n");
			}
		}catch (IOException e){}
	}
}*/







//scanner
/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class array1
{
	public static void main(String args[])
	{
		int a[][],b[][],ans[][],i,j;
		Scanner sc=new Scanner(System.in);
		a=new int[10][10];
		b=new int[10][10];
		ans=new int[10][10];
		
		{
			
			
			System.out.println("\n\t Enter value of matrix 3*3");
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{					
					a[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("\n\t Enter values of matrix3*3");
			for(i=1;i<=3;i++)
			{
				for (j=1;j<=3;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("\n\tAddition of A and B:");
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{
					ans[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{
					System.out.print("\t"+ans[i][j]);
				}
				System.out.print("\n");
			}
		}
	}
}*/

		
	
//2d		
/*import java.io.*;
import java.lang.*;
class array1
{
	public static void main(String args[])
	{
		int a[][],b[][],ans[][],i,j;
		a=new int[10][10];
		b=new int[10][10];
		ans=new int[10][10];
		try
		{
			
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("\n\t Enter value of matrix 3*3");
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{					
					a[i][j]=Integer.parseInt(ob.readLine());
				}
			}
			
			System.out.println("\n\t Enter values of matrix3*3");
			for(i=1;i<=2;i++)
			{
				for (j=1;j<=2;j++)
				{
					b[i][j]=Integer.parseInt(ob.readLine());
				}
			}
			
			System.out.println("\n\tAddition of A and B:");
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
					ans[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
					System.out.print("\t"+ans[i][j]);
				}
				System.out.print("\n");
			}
		}catch (IOException e){}
	}
}*/







//data Input stream
import java.io.*;
import java.lang.*;
class array1
{
	public static void main(String args[])
	{
		int a[][][],b[][][],c[][][],ans[][][],i,j,k;
		a=new int[10][10][10];
		b=new int[10][10][10];
		c=new int[10][10][10];
		ans=new int[10][10][10];
		try{
			
			
			System.out.println("\n\t Enter value of matrix 2*2");
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
                   for(k=1;k<=2;k++)
				   {					   
					a[i][j][k]=Integer.parseInt(ob.readLine());
				   }
				}
			}
			
			System.out.println("\n\t Enter values of matrix 2*2");
			for(i=1;i<=2;i++)
			{
				for (j=1;j<=2;j++)
				{
					for(k=1;k<=2;k++)
					{
					b[i][j][k]=Integer.parseInt(ob.readLine());
					}
				}
			}
			System.out.println("\n\t Enter values of matrix2*2");
			for(i=1;i<=2;i++)
			{
				for (j=1;j<=2;j++)
				{
					for(k=1;k<=2;k++)
					{
					c[i][j][k]=Integer.parseInt(ob.readLine());
					}
				}
			}
			
			System.out.println("\n\tAddition of A,B and C:");
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
					for(k=1;k<=2;k++)
					{
					ans[i][j][k]=a[i][j][k]+b[i][j][k]+c[i][j][k];
					}
				}
			}
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
					for(k=1;k<=2;j++)
					{
					System.out.print("\t"+ans[i][j][k]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
	}catch(IOException e) {}
	}
}






//BufferedReader
/*import java.io.*;
import java.lang.*;
class array1
{
	public static void main(String args[])
	{
		int a[][][],b[][][],c[][][],ans[][][],i,j,k;
		a=new int[10][10][10];
		b=new int[10][10][10];
		c=new int[10][10][10];
		ans=new int[10][10][10];
		try{
			BufferedReader ob=new BufferedReader(new InputStreamReader (System.in());
			
			System.out.println("\n\t Enter value of matrix 2*2");
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
                   for(k=1;k<=2;k++)
				   {					   
					a[i][j][k]=Integer.parseInt(ob.readLine());
				   }
				}
			}
			
			System.out.println("\n\t Enter values of matrix 2*2");
			for(i=1;i<=2;i++)
			{
				for (j=1;j<=2;j++)
				{
					for(k=1;k<=2;k++)
					{
					b[i][j][k]=Integer.parseInt(ob.readLine());
					}
				}
			}
			System.out.println("\n\t Enter values of matrix2*2");
			for(i=1;i<=2;i++)
			{
				for (j=1;j<=2;j++)
				{
					for(k=1;k<=2;k++)
					{
					c[i][j][k]=Integer.parseInt(ob.readLine());
					}
				}
			}
			
			System.out.println("\n\tAddition of A,B and C:");
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
					for(k=1;k<=2;k++)
					{
					ans[i][j][k]=a[i][j][k]+b[i][j][k]+c[i][j][k];
					}
				}
			}
			for(i=1;i<=2;i++)
			{
				for(j=1;j<=2;j++)
				{
					for(k=1;k<=2;j++)
					{
					System.out.print("\t"+ans[i][j][k]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
	}catch(IOException e) {}
	}
}
*/