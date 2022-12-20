package wordsearch;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
// An AWT GUI program inherits the top-level container java.awt.Frame
public class BuildView extends JFrame implements ActionListener{
   private JTextField[] gridCells;  // Array of 10 numeric Buttons
   private Button btnHash, btnStar;
   private JTextField tfInput;
   private Label text1;
   private JButton setButton, buildButton;
   private int size;
   private Panel panelDisplay, grid;
 
   // Constructor to setup GUI components and event handlers
   public BuildView () {
	   setButton = new JButton();
	   setButton.setBounds(100,100,100,25);
	   setButton.addActionListener(this);
	   setButton.setText("Set");
	   
	   buildButton = new JButton();
	   buildButton.setBounds(100,100,100,25);
	   buildButton.addActionListener(this);
	   buildButton.setText("Build");

	   tfInput = new JTextField(3);
	   text1 = new Label("Enter Size: ");


	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   // Set up display panel
	   panelDisplay = new Panel(new FlowLayout(FlowLayout.CENTER, 0, 0));
	   panelDisplay.add(text1);
	   panelDisplay.add(tfInput);
	   panelDisplay.add(setButton);


	   setLayout(new BorderLayout());  // "super" Frame sets to BorderLayout
	   add(panelDisplay, BorderLayout.NORTH);
	   
	   
	   setTitle("Word Search Solver (WSS)"); // "super" Frame sets title
	   setSize(400, 200);             // "super" Frame sets initial size
	   setVisible(true);              // "super" Frame shows
   }

   
   @Override
   public void actionPerformed(ActionEvent e) {
	   if(e.getSource()==setButton) {
		   try{
			   size = Integer.parseInt(tfInput.getText());
			   System.out.println("Created table");
			   setButton.setEnabled(false);
			   setSize(new Dimension(size*50, size*65));
			   setVisible(true);
			   
			   grid = new Panel(new GridLayout(size, size));
			   gridCells = new JTextField[size*size];
			   
			   for(int i=0; i<(size*size); i++) {
				   gridCells[i] = new JTextField();
				   gridCells[i].setHorizontalAlignment(JTextField.CENTER);
				   grid.add(gridCells[i]);
			   }

			   add(grid, BorderLayout.CENTER);
			   add(buildButton, BorderLayout.SOUTH);
		   }
		   catch (NumberFormatException ex){
			   System.out.println("enter an integer");
			  //ex.printStackTrace();
		   }
	   }
	   if(e.getSource()==buildButton) {
		   try{
			   new SearchView();
			   
			   char[][] data = new char[size][size];
			   for(int k=0, i=0, j=0; k<size*size; k++) {
				   data[i][j] = gridCells[k].getText().charAt(0);
				   i++;
				   j++;
				   if(j==size) {
					   j=0;
					   i
				   }
			   }
		   }
		   catch (NumberFormatException ex){
		   }
	   }
   }
}