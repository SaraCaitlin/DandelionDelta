import java.util.Scanner;

public class ScannerPrompt {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.println("Type first integer: ");
	int x = in.nextInt();
	System.out.println("Type second integer: ");
	int y = in.nextInt();
	
	System.out.print(x + y);
	}
}
