import java.io.*;
import java.util.*; 
import java.*;
import java.lang.String;

public class FileSearch 
{
	public int i;
	public String[] FileName = {"src/File1.txt","src/File2.txt","src/File3.txt","src/File4.txt"};
	public String sentence1;
	public int[] FileSelected;
	
	public int[] getparams(String sentence, int[] FileChosen)
	{
		this.sentence1 = sentence;
		int[] CounterFile = {0,0,0,0};
		int Count = 0;
		
		for(i=0; i<4; i++)
		{
			if(FileChosen[i] == 1)
			{
				Count = 0;
				//read method
				BufferedReader reader;
				String filename = FileName[i];
				
				try {
				reader = new BufferedReader(new FileReader(filename));
				
				String FileInUse = reader.readLine();
				
				String[] ArrayofFile = FileInUse.split(" ");
				String[] SplittedString = sentence1.split(" ");
				
				for(int z=0; z<ArrayofFile.length; z++)
				{
					for(int n=0; n<SplittedString.length; n++)
					{
						if(SplittedString[n].equals(ArrayofFile[z]))
						{
							Count +=1;
						}
					}
				}
				
				CounterFile[i] = Count;
				reader.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	return CounterFile;
	}
}

