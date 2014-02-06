
public class Bug{
 
 public int position;
 public int direction;
 
 public Bug(int initialPosition)
 {
	position = initialPosition;
 }
 
 public Bug()
 {
	direction = 0; 
 
 }
 public void move()
 {
    if (direction == 0)
	 position = position + 1;
    
    if (direction == 1)
     position = position - 1;	
 }
 
 public void turn() //not turning in BugTester
 {
  if (direction == 0)
	  direction = direction + 1;
  
  if (direction == 1)
	  direction = direction -1;
 }
 
 public int getPosition()
 {
    return position; 
 }
}