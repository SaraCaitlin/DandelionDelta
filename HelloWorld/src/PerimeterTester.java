import java.awt.Rectangle;
public class PerimeterTester {
	public static void main(String[] args){
		Rectangle box = new Rectangle (0, 0, 10, 17);
		System.out.print("Perimeter: ");
		System.out.println(box.getWidth() * 2 + box.getHeight() * 2);
		System.out.println("Expected: 54");
		}
}
