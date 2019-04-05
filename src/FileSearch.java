import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch extends GUI
{
	private static final long serialVersionUID = 1L;
	public File F1 = new File("File1.txt");
	public File F2 = new File("File2.txt");
	public File F3 = new File("File3.txt");
	public File F4 = new File("File4.txt");

	public void getword(String sentence)
	{
		this.sentence = sentence;
	}
	
	public void Getchoice(int counter) 
	{
		System.out.println(counter);
	}
	
	public void ReadFile(String F1, String F2,String F3,String f4) throws Exception 
	{
		Scanner SC = new Scanner(F1);
		SC.useDelimiter("");
		
		if(counter == 1)
		{
			if(sentence.equals(F1))
			{
				System.out.println("yesssssssss");
			}
		}
	}
}

