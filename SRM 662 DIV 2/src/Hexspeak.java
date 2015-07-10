import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Hexspeak {
	
	public String decode(long ciphertext) {
		String res=Long.toHexString(ciphertext).replace('1', 'I').replace('0','O').toUpperCase();
		for(char i='2';i<'9';++i){
			if(res.indexOf(i)!=-1){
				 return "Error!";
			}
		}
		return res;
	}
}
