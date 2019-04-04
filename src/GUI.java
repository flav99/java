import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class GUI extends JFrame 
{
	private static final long serialVersionUID = 1L;
	public JFrame JF;
	public JTextField word;
	public JTextField result;
	public String sentence;
	public JCheckBox F1,F2,F3,F4;
	public JButton submit;
	  
		  public void gui()
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
			   
			   //search button
			   JButton submit = new JButton("search");
			   submit.addActionListener(new ActionListener() {
			   	
				public void actionPerformed(ActionEvent e) 
				{
					 sentence = word.getText();
					 getword(sentence);  
					 System.out.println(sentence);
			   	}
			   });

			   submit.setBounds(312, 54, 111, 39);
			   getContentPane().add(submit);
			   
			   //title for result
			   JLabel lblResult = new JLabel("Result");
			   lblResult.setBounds(209, 182, 46, 14);
			   getContentPane().add(lblResult);
			   
			   //result text field
			   result = new JTextField();
			   result.setBounds(123, 209, 207, 136);
			   getContentPane().add(result);
			   result.setColumns(10);
			   
			   //check box
			   JCheckBox F1 = new JCheckBox("File1\r\n");
			   F1.setBounds(192, 54, 80, 23);
			   getContentPane().add(F1);
			   
			   JCheckBox F2 = new JCheckBox("File2\r\n");
			   F2.setBounds(192, 80, 80, 14);
			   getContentPane().add(F2);
			   
			   JCheckBox F3 = new JCheckBox("File3\r\n");
			   F3.setBounds(192, 97, 80, 23);
			   getContentPane().add(F3);
			   
			   JCheckBox F4 = new JCheckBox("File4\r\n");
			   F4.setBounds(192, 118, 80, 23);
			   getContentPane().add(F4);
			   
			   setVisible(true);			   
		 }

		public GUI()
		 {
			 gui();
		 }

		 public void getword(String sentence)
		 {
			this.sentence = sentence;
			FileSearch FS = new FileSearch();
			FS.getword(sentence);
		 }
}