
/**
	   Allows access to certain Java templates
	   	 */
	import javax.swing.JComponent;
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
	/**
	   Draws a die by expanding upon JComponent.
	   @param diecolor the number corresponding with the solid color of die
	   @param dotcolor the number corresponding with the solid color of dot on die
	   @param diespecs the (x1,y1,x2,y2) coordinates of the die
	 */
public class MyFace extends JComponent{
	
		private static final long serialVersionUID = 1L; //Eclipse said I should have this line of code
	
	public int diecolor;
	public int dotcolor;
	private String diespecs; //cannot be changed by user
	
	MyFace(){ //Default constructor
		diecolor = 0;
	    dotcolor = 0;
	    diespecs = "Rectangle(5, 5, 25, 25)";
	}
	
	MyFace(int i, int t){ //User input constructor
		diecolor = i;
		dotcolor = t;
		diespecs = "Rectangle(5, 5, 25, 25)";
	}
	
		/**
		 * Method that draws the die
		 * @param die Rectangle Object to form outside of die
		 * @param dot Ellipse Object to form number symbol on die
		 */
	    public void paintComponent(Graphics g){	
	    	
	    	Graphics2D g2 = (Graphics2D) g; //a cast to recover Graphics2D ... The book said I needed it.
	        
	    	Rectangle die = new Rectangle(5, 5, 25, 25); //creates a square named die
	    	if (diecolor == 0)//Default color for die is white filled
	    		g2.setColor(Color.WHITE); 
	        	g2.fill(die);
	    	if (diecolor > 0)//With user input die is red filled
	    		g2.setColor(Color.RED); 
	    		g2.fill(die);
	    		g2.draw(die);
	    	
	        Ellipse2D.Double dot = new Ellipse2D.Double(15, 15, 4, 4); //creates a circle named dot
	        if (dotcolor == 0) //Default color for dot is dark gray filled
	        	g2.setColor(Color.DARK_GRAY); 
	        	g2.fill(dot);
	        if (dotcolor > 0) //With user input dot is blue filled
	        	g2.setColor(Color.BLUE); 
	        	g2.fill(dot);
	        	g2.draw(dot);
	    } 
	    /**
	     * Defines the meaning of toString() rather than using the built in function
	     * @param dieplacement a string made by combining two other strings to provide the private location of the die
	     * @return string 
	     */
	    public String toString(){
	    		
	    	String diePlacement = "MyFace die " + diespecs;  
	    	return diePlacement;
	    }
	}