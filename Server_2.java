/*Server side program.*/
import java.net.*;
import java.io.*;
public class Server_2
{
	public static void main(String [] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();
		System.out.println("Client connected");
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Client:"+str);
	}
}

/*Client side program*/
import java.net.*;
import java.io.*;
public class Client_2
{
	public static void main(String [] args) throws IOException
	{
	Socket s = new Socket("localhost",4999);
	PrintWriter pr  = new PrintWriter(s.getOutputStream());
	pr.println("is it working");
	pr.close();
	}
}