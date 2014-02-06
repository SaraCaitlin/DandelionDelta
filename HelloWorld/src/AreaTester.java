import java.awt.Rectangle;
public class AreaTester {
	public static void main(String[] args){
	Rectangle box = new Rectangle (0, 0, 20, 30);
	System.out.print("Area: ");
	System.out.println(box.getWidth() * box.getHeight());
	System.out.println("Expected: 600");
	}
}
