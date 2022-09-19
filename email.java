import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
class email

{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Email_ID:");
		String e=br.readLine();
		boolean ans=isVaildEmail(e);
		if (ans)
		{
			System.out.print(e+"is not a valid Email address:");
		}
	}
	public static boolean isVaildEmail(String email)
	{
	String s="^A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+)*(\\.A-Za-z]{2,})$";
	Pattern n=Pattern.compile(s);
	Matcher m=n.matcher(email);
	return m.matches();
	}
}