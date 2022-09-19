import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
class appendfile
{
	public static void main(String args[])
	{
		try
		{
			String str = "This is my str which be appended" +
										"at the end of specified file" +
										"This is my str which would be appede" + 
										"At the end of the specified file" +
										"A real-world stack allows operations" +
										"At one end only For example we can place";
										
            File f=new File("newfile7.txt");
		  if(!f.exists())
		  {
			  f.createNewFile();
		  }
		  FileWriter fw = new FileWriter(f,true);
		  BufferedWriter bw = new BufferedWriter(fw);
		  bw.write(str);
		  bw.close();
		  System.out.println("Date a successfully append at the end of file");
		}catch(IOException ioe)
		{   }
	}
}