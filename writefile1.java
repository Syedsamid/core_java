import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class writefile1
{
	public static void main (String args[])
	{
		FileOutputStream fos = null;
		File f;
		String str = "Twinkle, twinkle, little star How I wonder what you are" +
                      "Up above the world so high Like a diamond in the sky" +
                      "Twinkle, twinkle, little star How I wonder what you are";
					  try
					  {
						  f=new File("newfile19.txt");
						  fos=new FileOutputStream(f);
						  if(!f.exists())
						  {
							  f.createNewFile();
						  }
						  byte[] arr=str.getBytes();
						  fos.write(arr);
						  fos.flush();
						  System.out.println("File Written Successfully");
					  }catch (IOException ioe)
					  {
						  ioe.printStackTrace();
					  }
	}
}