import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class readfile2
{
	public static void main(String args[])
	{
		BufferedReader br = null;
		BufferedReader br2 = null;
		try
		{
			br= new BufferedReader(new FileReader("C:\\newfile7.txt"));
			System.out.println("Readline the file using readline() method:");
			String cl=br.readLine();
			
			while(cl!=null)
			{
				System.out.println(cl);
				cl = br.readLine();
			}
			br2=new BufferedReader(new FileReader("C:\\newfile3"));
			System.out.println("Readline the file using read() method:");
			int num=0;
			char ch;
			while((num=br2.read())!= -1)
			{
				ch=(char)num;
				System.out.print(ch);
			}
		}catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
