import java.io.*;

class readfile1
{
	public static void main(String args[])
	{
		File f=new File("newFile19.txt");
		BufferedInputStream bis = null;
		FileInputStream fis= null;
		try
		{
			fis=new FileInputStream(f);
			bis=new BufferedInputStream(fis);
			while(bis.available()>0)
			{
				System.out.print((char)bis.read());
			}
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("The specified file not found" +fnfe);
		}
		catch(IOException ioe)
		{
			System.out.println("I/O Exception:" +ioe);
		}
	}
}