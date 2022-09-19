//Bydefault
/*import java.io.*;
import java.lang.*;

class marks
{
public static void main(String arg[])	
	{
		double eng,hin,math,sci,his,mari;
		Double total,avg;
		eng=40;
		hin=65;
		math=47;
		sci=77;
		his=67;
		mari=53;
		total=eng+hin+math+sci+his+mari;
		avg=total/6;
		System.out.println("\n\t Eng                  ="+eng);
		System.out.println("\n\t Hin                  ="+hin);
		System.out.println("\n\t math				  ="+math);
		System.out.println("\n\t sci 				  ="+sci);
		System.out.println("\n\t his 				  ="+his);
		System.out.println("\n\t mari 				  ="+mari);
		
		System.out.print("\n\t Tota="+total);
		System.out.print("\n\t Tota="+avg);
		
	}
}
*/

/*import java.io.*;
import java.lang.*;

class marks
{
public static void main(String arg[])	
	{
		double eng,hin,math,sci,his,mari;
		Double total,avg;
		eng=Double.parseDouble(arg[0]);
		hin=Double.parseDouble(arg[1]);
		math=Double.parseDouble(arg[2]);
		sci=Double.parseDouble(arg[3]);
		his=Double.parseDouble(arg[4]);
		mari=Double.parseDouble(arg[5]);
		total=eng+hin+math+sci+his+mari;
		avg=total/6;
		System.out.println("\n\t Eng                  ="+eng);
		System.out.println("\n\t Hin                  ="+hin);
		System.out.println("\n\t math				  ="+math);
		System.out.println("\n\t sci 				  ="+sci);
		System.out.println("\n\t his 				  ="+his);
		System.out.println("\n\t mari 				  ="+mari);
		
		System.out.print("\n\t Tota="+total);
		System.out.print("\n\t Tota="+avg);
		
	}
}*/
//Scanner
/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class marks
{
public static void main(String arg[])	
	{
		double eng,hin,math,sci,his,mari;
		Scanner sc =new Scanner(System.in);
		Double total,avg;
		
		
		System.out.print("\n\t Eng                  =");
		eng=sc.nextDouble();
		System.out.print("\n\t Hin                  =");
		hin=sc.nextDouble();
		System.out.print("\n\t math				  =");
		math=sc.nextDouble();
		System.out.print("\n\t sci 				  =");
		sci=sc.nextDouble();
		System.out.print("\n\t his 				  =");
		his=sc.nextDouble();
		System.out.print("\n\t mari 				  =");
		mari=sc.nextDouble();
		total=eng+hin+math+sci+his+mari;
		avg=total/6;
		
		
		System.out.print("\n\t Tota="+total);
		System.out.print("\n\t Tota="+avg);
		
	}
}*/
//Data input stream
/*import java.io.*;
import java.lang.*;

class marks
{
public static void main(String arg[])throws IOException	
	{
		Double eng,hin,math,sci,his,mari;
		DataInputStream ob=new DataInputStream(System.in);
		Double total,avg;
		
		System.out.print("\n\t English                  =");
		eng=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t Hindi                    =");
		hin=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t maths				    =");
		math=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t science 				    =");
		sci=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t history 				    =");
		his=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t marathi 			        =");
		mari=Double.parseDouble(ob.readLine());
		
		total=eng+hin+math+sci+his+mari;
		avg=total/6;
		
		
		System.out.print("\n\t Tota="+total);
		Syste+m.out.print("\n\t Tota="+avg);
		
	}
}*/

import java.io.*;
import java.lang.*;

class marks
{
public static void main(String arg[])throws IOException	
	{
		Double eng,hin,math,sci,his,mari;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		
		Double total,avg;
		
		System.out.print("\n\t English                  =");
		eng=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t Hindi                    =");
		hin=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t maths				    =");
		math=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t science 				    =");
		sci=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t history 				    =");
		his=Double.parseDouble(ob.readLine());
		
		System.out.print("\n\t marathi 			        =");
		mari=Double.parseDouble(ob.readLine());
		
		total=eng+hin+math+sci+his+mari;
		avg=total/6;
		
		
		System.out.print("\n\t Tota="+total);
		System.out.print("\n\t Tota="+avg);
		
	}
}



