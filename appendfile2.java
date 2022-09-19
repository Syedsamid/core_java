import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
class appendfile2
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("newfiel10.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fw =new FileWriter(f,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("");
			pw.println("This is first line");
			pw.println("This is the second line");
			pw.println("This is third line");
			pw.close();
			System.out.println("Data successfully appended at the end of file");
		}catch(IOException ioe){}
	}
}
