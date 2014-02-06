
public class CodingBatFirstTwo {
	public String firstTwo(String str) {
		  
		  if (str.length() >= 2)
		  {String first = str.substring(0,2);
		  return first;}
		  
		  else if (str.length() == 1)
		  {String first = str.substring (0,1);
		  return first;}
		  
		  else
		  return str;
		}
}
