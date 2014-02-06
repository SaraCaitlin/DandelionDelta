
 
import javax.swing.JFrame; //template for frame
/**
 * FaceTester
 * @author Sara Caitlin Neubert
 * CS220 Java
 * Lab 1
 * 
 * Tests MyFace.java and OppositeFace.java
 */
public class FaceTester {
    /**
     * Method that constructs the frame
     * @param table the frame named table in which MyFace and OppositeFace are presented
     * @param rollone the MyFace example object
     * @param rollsix the OppositeFace example object
     */
	public static void main(String[] args)
	{
		JFrame table = new JFrame();
		
		table.setSize(300, 200); //Dimensions of table
		table.setTitle("Luck of the Roll"); //title across the top of table
		table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows user to close out of table by pressing the 'x' button
		
		
			MyFace rollone = new MyFace();
			table.add(rollone); //attaches rollone to table
			table.setVisible(true); //produces rollone graphic on table
	    
	
			OppositeFace rollsix = new OppositeFace();
			table.add(rollsix); //attaches rollsix to table
			table.setVisible(true); //produces rollsix graphic on table
	  	
	  		System.out.println(rollsix.toString()); //prints out rollsix dieplacement value
	  		System.out.println(rollone.toString()); //prints out rollone dieplacement value
}
}
