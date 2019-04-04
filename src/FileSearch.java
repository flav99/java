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
	private Scanner MyScanner;
	private int counter1;

	public void getword(String sentence)
	{
		this.sentence = sentence;
	}
	
	public void ReadFile(String F1, String F2,String F3,String f4) throws FileNotFoundException
	{
		MyScanner = new Scanner(F1);
		MyScanner.useDelimiter(",");
		
		while(MyScanner.hasNext())
		{
			sentence = MyScanner.next();
			
			if (sentence.equals(F1))
			{
				counter1 ++;
				System.out.println("found");
			}
		}
	}
}

