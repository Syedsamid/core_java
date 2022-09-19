import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class copyfile
{
	public static void main(String args[])
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			File f1 =new File("newfile7.txt");
			File f2 =new File("newFile18.txt");
			in =new FileInputStream(f1);
			out =new FileOutputStream(f2);
			
			byte[] b =new byte[1024];
			int len;
			while((len = in.read(b)) > 0)
			{
				out.write(b, 0,len);
			}
			in.close();
			out.close();
			System.out.println("File copied successfully!!");
		}catch(IOException ioe){  }
	}
}