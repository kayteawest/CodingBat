
public class warmUp1 {
	
	/* 
	 * Practice Problem:
	 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
	 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 */
	
	/*
	 * Expected Outcomes:
	 * sleepIn(false, false) → true 
	 * sleepIn(true, false) → false 
	 * sleepIn(false, true) → true
	 * sleepIn(true, true) → true
	 */

	public static void main(String[] args) {
		
		boolean weekdayYes = true;
		boolean weekdayNo = false;
		boolean vacationYes = true;
		boolean vacationNo = false;
		
		boolean outcomeOne = sleepIn(weekdayNo, vacationNo);
		System.out.println(outcomeOne);
		
		boolean outcomeTwo = sleepIn(weekdayYes, vacationNo);
		System.out.println(outcomeTwo);
		
		boolean outcomeThree = sleepIn(weekdayNo, vacationYes);
		System.out.println(outcomeThree);
		
		boolean outcomeFour = sleepIn(weekdayYes, vacationYes);
		System.out.println(outcomeFour);

	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if(weekday != true || vacation == true) {
			  return true;
		  }
		  return false;
	}
	
}
