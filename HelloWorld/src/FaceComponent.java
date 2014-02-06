import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
   Draws a face.
 */
public class FaceComponent extends JComponent
{
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
    //Draws the head
      Ellipse2D.Double head = new Ellipse2D.Double(0, 0, 200, 200);
      g2.draw(head);
      
    //Draws left eye
      Ellipse2D.Double lefteye = new Ellipse2D.Double(50, 50, 20, 20);
      g2.draw(lefteye);
      
    //Draws right eye
      Ellipse2D.Double righteye = new Ellipse2D.Double(125, 50, 20, 20);
      g2.draw(righteye);
   
    //Draws the mouth
      Line2D.Double mouth = new Line2D.Double(50, 125, 145, 125);
      g2.draw(mouth);
   }
}