import java.io.*;
class Fcopy
{
	public static void main(String a[])throws IOException,FileNotFoundException
	{
		int i;
		FileInputStream fin ;FileOutputStream fos;
		fin = new FileInputStream(a[0]);
		fos = new FileOutputStream(a[1]);
		do
		{
			i = fin.read();
			if(i!=-1)
			{
				fos.write(i);
			}
		}while(i!=-1);
		System.out.println("File copied successfully");
	}
}