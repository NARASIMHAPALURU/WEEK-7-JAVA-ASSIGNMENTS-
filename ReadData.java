import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadData
{
	public static void main(String [] args)throws Exception
	{
		java.io.File file = new java.io.File("Fcopy.java");
		Scanner input = new Scanner(file);
		String fileContent = " ";
		while(input.hasNext())
		{
			fileContent += input.next()+" ";
		}
		char [] charArr = fileContent.toCharArray();
		int counter = 0;
		for(char c : charArr)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				counter++;
		}
		System.out.println("Number of vowels are:"+counter);
		BufferedReader reader = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		try{
			reader = new BufferedReader(new FileReader("Fcopy.java"));
			String currentLine = reader.readLine();
			while(currentLine != null)
			{
				lineCount++;
				String[] words = currentLine.split(" ");
				wordCount = wordCount+words.length;
				for(String word:words)
				{
					charCount = charCount+word.length();
				}
				currentLine = reader.readLine();
			}
			System.out.println("Number of chars:"+charCount);
			System.out.println("Numbers of words:"+wordCount);
			System.out.println("Number of lines:"+lineCount);
		}catch(IOException e)
		{
		}
		finally{
			try{
				reader.close();
			}catch(IOException e)
			{
			}
		}
	}
}

			
			
		

		