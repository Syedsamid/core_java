import java.io.*;
import java.lang.*;
class switch
{
	public static void main(string args[]);
	{
		int n,n1,ans,ch;
		double n2,ans2;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println(n1-------Menu-----------");
			System.out.println("1.min\n\t2.max\n\t,3round\n\t,4.abs\n\t,5.sqrt");
			
				System.out.println ("Enter your choice");
				ch =Inerger.parseInt(ob.readLine());
	switch(ch)
	{
		case 1:
		        System.out.println("Enter the 1 no");
				n=Interger.parseInt(ob.readLine());
				System.out.println("Enter the 2 no");
				n1=Interger.parseInt(ob.readLine());
				   ans=Math.min(n,n1);
				 System.out.println("\n\tmin=+ans);
				 break;
		case 2:
                System.out.println("Enter the 1 no");
				n=Interger.parseInt(ob.readLine());
				System.out.println("Enter the 2 no");
				n1=Interger.parseInt(ob.readLine());
				   ans=Math.min(n,n1);
				 System.out.println("\n\tman=+ans);
				 break;		
		case 3:
		        System.out.println("Entr thr 1 no");
				n2=Float.parseFloat(ob.readLine());
	                 ans2Math.round(n2);
                System.println("\n\tRound value="+ans2);
				break;
		/*case 4:
                System.out.println("Enter the 1 no");
				n=Integer.parseInt(ob.readLine());
                       ans=Math.pow(n);
				System.out.println("\n\tpower of =+ans)");*/	   
		case 5:
                System.out.println("Enter the 1 no");
				n2=Float.parseFloatln(ob.realine());
				        ans=Math.abs(n2);
				System.ot.println("\n\tabs="+ans2);
				break;
				
		default:
		          System.out.println("Wrong choice");
	}
		}catch(IOException e){}
	}
}
			
