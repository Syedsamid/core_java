import java.io.*;
import java.lang.*;
//import java.util.*;
class pallinString
{
	public static void main(String args[])
	{
	    String Reverse="";
		
		boolean result=false;
		String str;
		//Scanner st=new Scanner(System.in);
		try
		{
		BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter string:");
		str=(st.readLine());
		for(int i=str.length()-1;i>=0;i--)
		{
			char ans=str.charAt(i);
			Reverse=Reverse+ans;
		}
	
		result=str.equals(Reverse);
		
		if(result == true)
		{
			System.out.print(str+"\n\tIs palindrome String:");
		}
		else
		{
			System.out.print(str+"\n\tIs not palindrome:");
		}
		}catch(Exception e){}
	}
}
s