import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Time {
	
	public String whatTime(int s) {
		int h=s/3600;
		s=s%3600;
		int m=s/60;
		s=s%60;
		return h+":"+m+":"+s;
	}
}
