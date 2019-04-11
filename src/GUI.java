import javax.swing.*;

import java.awt.List;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class GUI extends JFrame 
{
	private static final long serialVersionUID = 1L;
	public JFrame JF;
	public JTextField word;
	public String sentence;
	public JCheckBox F1,F2,F3,F4;
	public JButton submit;
	public int counter = 0;
	public int[] FileChosen = {0,0,0,0};
	public int[] results = {0,0,0,0};
	public int answer1 =0;
	public int answer2 =0;
	public int answer3 =0;
	public int answer4 =0;
	public String[] FileNames = {"File1.txt","File2.txt","File3.txt","File4.txt"};
	
		  public void frame()
		  {
			  
			  JF = new JFrame();
			  setLocation(100,100);
			  
			   //size of the frame  
			   setSize(478,477);
			   getContentPane().setLayout(null);
			   
			   //gets users string
			   word = new JTextField();
			   word.setBounds(43, 54, 98, 39);
			   word.setText("Enter word");
			   getContentPane().add(word);
			   word.setColumns(10);
			   
			   //title
			   JLabel title = new JLabel("SEARCH ENGINE");
			   title.setBounds(192, 11, 100, 39);
			   getContentPane().add(title);
			   
			   JButton submit = new JButton("search");
			   submit.setBounds(312, 54, 111, 39);
			   getContentPane().add(submit);
			   
			   //check box
			   F1 = new JCheckBox("File1\r\n");
			   F1.setBounds(192, 54, 80, 23);
			   getContentPane().add(F1);
			   
			   F2 = new JCheckBox("File2\r\n");
			   F2.setBounds(192, 80, 80, 14);
			   getContentPane().add(F2);
			   
			   F3 = new JCheckBox("File3\r\n");
			   F3.setBounds(192, 97, 80, 23);
			   getContentPane().add(F3);
			   
			   F4 = new JCheckBox("File4\r\n");
			   F4.setBounds(192, 118, 80, 23);
			   getContentPane().add(F4);
			   //search button
			   submit.addActionListener(new ActionListener() {
			   	
				public void actionPerformed(ActionEvent e) 
				{
					 sentence = word.getText();
					 
					//if 1 is selected put 1 in array slot 0
						if(F1.isSelected())
						{
							FileChosen[0] = 1;
						}
						//if 2 is selected put 1 in array slot 1
						if(F2.isSelected())
						{
							FileChosen[1] = 1;
						}
						//if 3 is selected put 1 in array slot 2
						if(F3.isSelected())
						{
							FileChosen[2] = 1;
						}
						//if 4 is selected put 1 in array slot 3
						if(F4.isSelected())
						{
							FileChosen[3] = 1;
						}
						
						FileSearch FS = new FileSearch();
						results=FS.getparams(sentence, FileChosen);					
						
						answer1 = results[0];
						answer2 = results[1];
						answer3 = results[2];
						answer4 = results[3];
						
						ArrayList<Integer> list = new ArrayList<Integer>(); 
						list.add(answer1);
						list.add(answer2);
						list.add(answer3);
						list.add(answer4);
						
						Collections.sort(list, Collections.reverseOrder());

						System.out.println(list);
						
						System.out.println("the file with the most frequency of the word is : File1.txt with a result of: "+list.get(0));
						System.out.println("the file with the second most frequency of the word is : File4.txt with a result of: "+list.get(1));
						System.out.println("the file with the third most frequency of the word is : File3.txt with a result of: "+list.get(2));
						System.out.println("the file with the fouth nost frequency of the word is : File2.txt with a result of: "+list.get(3));   
			   	}
			   });
			   setVisible(true);	   
		  }
		  
		public GUI()
		 {
			 frame();
		 }

}