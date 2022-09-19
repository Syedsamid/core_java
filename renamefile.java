import java.io.File;
public class renamefile
{
	public static void main(String[] args)
	{
		File of=new File("newfile2.txt");
		File nf=new File("newFile18.txt");
		boolean f = of.renameTo(nf);
		if(f)
		{
			System.out.println("File rename successfully");
		}
		else
		{
			System.out.println("Renameoperation failed");
		}
	}
}