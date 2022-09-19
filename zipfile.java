import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class zipfile
{
	public void in()
	{
		byte[] b =new byte[1024];
		try
		{
			GZIPOutputStream g = new GZIPOutputStream(new FileOutputStream("newfile19.gz"));
			FileInputStream fis =new FileInputStream("newfile19.txt");
			int len;
			while((len = fis.read(b)) >0)
			{
				g.write(b, 0,len);
			}
			fis.close();
			g.finish();
			g.close();
			System.out.println("File Compressed!!");
		}catch(IOException ioe){  }
	}
	public static void main(String args[])
	{
		zipfile ob = new zipfile();
		ob.in();
	}
}