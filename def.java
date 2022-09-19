import java.io.*;
import java.lang.*;
class def
{
public static void main(String args[])
{
	
int a[][],b[][],ans[][],r,c;
a=new int[10][10];
b=new int[10][10];
ans=new int[10][10];


	try
{
      BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n\tEnter values of 3*3 matrix");
		
		for(r=1;r<=3;r++)
		{
		for(c=1;c<=3;c++)
		{
		a[r][c]=Integer.parseInt(ob.readLine());
		}
		}
		
		
		
		System.out.println("\n\tEnter values of 3*3 matrix");
		
		for(r=1;r<=3;r++)
		{
		for(c=1;c<=3;c++)
		{
		b[r][c]=Integer.parseInt(ob.readLine());
		}
		}
		
		System.out.println("\n\tAaddition of A and B is:");
		for(r=1;r<=3;r++)
		{
		for(c=1;c<=3;c++)
		{
		ans[r][c]=a[r][c]+b[r][c];
		}	
		}
		for(r=1;r<=3;r++)
		{
		for(c=1;c<=3;c++)
		{
		
		System.out.print("\t"+ans[r][c]);
		}
		System.out.print("\n");
		}
}catch (IOException e){}
		
}
}








/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class def
{
public static void main(String args[])
{
	
int a[][],b[][],ans[][],r,c;
a=new int[10][10];
b=new int[10][10];
ans=new int[10][10];


	
{
       Scanner sc=new Scanner(System.in);
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
		a[r][c]=sc.nextInt();
		}
		}
		
		
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
		b[r][c]=sc.nextInt();
		}
		}
		
		
		System.out.println("\n\tAddition of A and B is:");
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
		ans[r][c]=a[r][c]+b[r][c];
		}	
		}
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
		
		System.out.print("\t"+ans[r][c]);
		}
		System.out.print("\n");
		}
}
		
}
}






import java.io.*;
import java.lang.*;
import java.util.Scanner;
class def
{
public static void main(String args[])
{
	
int a[][][],b[][][],e[][][],ans[][][],r,c,f;
a=new int[10][10][10];
b=new int[10][10][10];
e=new int[10][10][10];
ans=new int[10][10][10];


	
{
       Scanner sc=new Scanner(System.in);
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
		for(f=1;f<=2;f++)
		{
		a[r][c][f]=sc.nextInt();
		}
		}
		}
		
		
System.out.println("=======================================================================");		
		
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
			for(f=1;f<=2;f++)
		{
		b[r][c][f]=sc.nextInt();
		}
		}
		}
System.out.println("=======================================================================");		
				
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
			for(f=1;f<=2;f++)
		{
		e[r][c][f]=sc.nextInt();
		}
		}
		}
System.out.println("=======================================================================");		
				
		
		System.out.println("\n\tAddition of A and B is:");
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
			for(f=1;f<=2;f++)
		{
		ans[r][c][f]=a[r][c][f]+b[r][c][f]+e[r][c][f];
		}	
		}
		}
		for(r=1;r<=2;r++)
		{
		for(c=1;c<=2;c++)
		{
			for(f=1;f<=2;f++)
		{
		
		System.out.print("\t"+ans[r][c][f]);
		}
		System.out.print("\t");
		}
		System.out.print("\n");
		}
}
		
}
}
*/








/*
import java.io.*;
import java.lang main(String args[])
{
	
int a[][][],b[][][],e[][][],ans[][][],r,c,f;
a=new int[10][10][10];
b=new int[10][10][10];
e=new int[10][10][10];
ans=new int[10][10][10];.*;
import java.util.Scanner;
class def
{
public static void


	
{
       Scanner sc=new Scanner(System.in);
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=3;r++)
		{
			for(c=1;c<=3;c++)
				{
					for(f=1;f<=3;f++)
					{
						a[r][c][f]=sc.nextInt();
					}
						System.out.println("\n");
				}
		}
		
		
System.out.println("=======================================================================");		
		
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=3;r++)
		{
			for(c=1;c<=3;c++)
			{
				for(f=1;f<=3;f++)
				{
					b[r][c][f]=sc.nextInt();
				}
			}
		}
System.out.println("=======================================================================");		
				
		
		System.out.println("\n\tEnter values of 2*2 matrix");
		
		for(r=1;r<=3;r++)
		{
			for(c=1;c<=3;c++)
			{
				for(f=1;f<=3;f++)
				{
					e[r][c][f]=sc.nextInt();
				}
			}
		}
System.out.println("=======================================================================");		
				
		
		System.out.println("\n\tAddition of A and B is:");
		for(r=1;r<=3;r++)
		{
			for(c=1;c<=3;c++)
			{
				for(f=1;f<=3;f++)
				{
					ans[r][c][f]=a[r][c][f]+b[r][c][f]+e[r][c][f];
				}	
			}
		}
				for(r=1;r<=3;r++)
				{
					for(c=1;c<=3;c++)
					{
						for(f=1;f<=3;f++)
						{
		
							System.out.print("\t"+ans[r][c][f]);
						}
							System.out.print("\t");
					}
						System.out.print("\n");
				}
}
		
}
}*/