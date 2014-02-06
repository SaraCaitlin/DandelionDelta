
public class AverageTester {
	public static void main(String[] args)
	   {
	      String word1 = "Mary";
	      String word2 = "had";
	      String word3 = "a";
	      String word4 = "little";
	      String word5 = "lamb";

	      int length1 = word1.length();
	      int length2 = word2.length();
	      int length3 = word3.length();
	      int length4 = word4.length();
	      int length5 = word5.length();
	      
	      int sum = (length1 + length2 + length3 + length4 + length5);
	      double average = (sum/5.0);
	     
	      System.out.println(average);
	      System.out.println("Expected: 3.6");
	   }
}
