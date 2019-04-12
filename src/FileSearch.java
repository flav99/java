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
		
		//loops through the array holding the file names
		for(i=0; i<4; i++)
		{
			if(FileChosen[i] == 1)//if 1 is found in the area compare the string to the file
			{
				Count = 0;
				//read method
				BufferedReader reader;
				String filename = FileName[i];
				
				try {
				reader = new BufferedReader(new FileReader(filename));
				
				String FileInUse = reader.readLine();
				
				String[] ArrayofFile = FileInUse.split(" ");//splits the file 
				String[] SplittedString = sentence1.split(" ");//splits the string
				
				for(int z=0; z<ArrayofFile.length; z++)//loops through the file
				{
					for(int n=0; n<SplittedString.length; n++)//loops through the array holding the string 
					{
						if(SplittedString[n].equals(ArrayofFile[z]))
						{
							Count +=1;//if there is a match increment the counter
						}
					}
				}
				
				CounterFile[i] = Count;//places the counter inside an array holding the frequency of how many times the word came up in the file
				reader.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	return CounterFile;//return the array holding the frequency 
	}
}

