import java.io.File;
import java.io.IOException;
class createfile
{
	public static void main(String args[])
	{
		try
		{
			File f = new F +-ile("C:\Users\Admin\Desktop\java");
			//File f=new File ("newFile18.txt");
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
