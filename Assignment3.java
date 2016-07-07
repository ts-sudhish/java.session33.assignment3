/**
 * 
 */
package sdh.java.session3;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Sudhish TS
 *
 */
public class Assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		System.out.println("Enter max limit :");
		int max=in.nextInt();
		Date date = new Date(); 
        long milliseconds = date.getTime(); 
        long randomNo = milliseconds % max;
		System.out.println("The random number generated between 0 and " + max + " inclusive is : " + randomNo);
	}
}