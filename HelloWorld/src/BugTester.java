
public class BugTester {
	public static void main(String[] args){
	
		Bug bugsy = new Bug(10);
	
		bugsy.turn();
		bugsy.move();
		System.out.print("Actual: ");
		System.out.println(bugsy.getPosition());
		System.out.println("Expected: 9");
	
	}
}
	
