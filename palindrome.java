import java.util.*;
public class Main
{
  public static void main (String[]arg)
  {
    Scanner in = new Scanner (System.in);
      System.out.println ("Enter the number = ");
    int number = in.nextInt ();
     boolean result= Palindrome_Checking (number);
     if(result){
         System.out.println ("The given number is palindrome "+
				number);
     }else{
         System.out.println ("The given number is not palindrome "+
				number);
     }
  }
     private static boolean Palindrome_Checking (int number)
  {
    int duplicate_Number = number;
    int rem = 0, rev_number = 0;
    if (number < 0 || (number % 10 == 0 && number != 0))
      return false;
    else
      {
	while (number > rev_number)
	  {
	    rem = number % 10;
	    rev_number = rev_number * 10 + rem;
	    number = number / 10;
	  }
	if (number == rev_number || number == rev_number / 10)
	  return true;
	else
	  return false;
      }
  }
}
