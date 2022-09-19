import java.io.File;
import java.io.IOException;
class createfile
{
	public static void main(String args[])
	{
		try
		{
			File f=new File ("C:\\newfile17.ppt");
			boolean v=f.createNewFile();
			if(v)
			{
				System.out.println("File has been created successfully");
			}
			else
			{
				System.out.println("File already  present at the specified location");
			}
		}catch (IOException e){}
	}
}
