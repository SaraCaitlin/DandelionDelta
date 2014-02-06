
public class Angles {
	/**
    Normalizes an angle.
    @param angle an integer angle (may be negative)
    @return the equivalent angle in the range 0 ... 359
 */
 public int normalize(int angle)
 {
    if (angle <= 0)
    	angle = angle+360;
    	
    if (angle > 0)
    	angle = angle-360;
    	
    		return angle;
     
 }
}
