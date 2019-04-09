import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.lang.*;
public class FileSearch 
{
	public int i;
	public String[] FileName = {"src/File1.txt","src/File2.txt","src/File3.txt","src/File4.txt"};
	public String sentence1;
	public int[] FileSelected;
	
	public void getparams(String sentence, int[] FileChosen)
	{
		this.sentence1 = sentence;
		this.FileSelected = FileChosen;
		int[] CounterFile = {0,0,0,0};
		int Count = 0;
		for(i=0; i<4; i++)
		{
			Count = 0;
		//System.out.println(FileChosen[i]);
			if(FileSelected[i] == 1)
			{
				String fileName = FileName[i]; 
				File file = new File(fileName);
					
				//read method
				BufferedReader reader;
				try {
				reader = new BufferedReader(new FileReader(file));
					
				String test = reader.readLine();
				while (test != null)
				{
					test = reader.readLine();
					String[] arr = test.split(" ");
						
					for(String testSplit : arr)
					{
						String[] arr2 = sentence1.split(" ");
							
						for(String sentence1 : arr2)
						{
							if(sentence1.equals(testSplit))
							{
								Count = Count + 1;
							}
						}
					}
				}
				
				CounterFile[i] = Count;
				for(int k=0; k<4; k++)
				{
				System.out.println(CounterFile[k]);
				}

				reader.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

