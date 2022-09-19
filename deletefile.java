import java.io.File;
public class deletefile
{
	public static void main(String[]  args)
	{
		try
		{
			File f= new File("newfile1.txt");
			if(f.delete())
			{
				System.out.println(f.getName() + " is delete");
			}
			else
			{
				System.out.println("Delete failed: File does'nt delete");
			}
		}catch(Exception e){}
	}
}