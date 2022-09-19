import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class writefile2
{
	public static void main(String args[])
	{
		BufferedWriter bw = null;
		try
		{
			String str = "This string would be written to the specified File";
			File f = new File("Desktop\\samid.doc");
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fw =new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(str);
			System.out.println("File written Successfully");
		}catch (IOException ioe){}
	}
}
