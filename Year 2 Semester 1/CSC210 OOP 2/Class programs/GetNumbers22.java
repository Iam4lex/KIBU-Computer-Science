import java.util.*;
public class GetNumbers22
{
	public static void main(String args[]) throws InputMismatchException
	{
		Scanner stdin = new Scanner(System.in);
		try{
			System.out.print("Enter the first non-negative number: ");
			int firstNumber = stdin.nextInt();
			System.out.print("Enter the second non-negative number: ");
			int secondNumber = stdin.nextInt();
			
			if (firstNumber < 0 || secondNumber < 0) {
            	throw new InputMismatchException("One or both of the numbers are negative.");
			}
        
				System.out.println("Your numbers are " + firstNumber + "and " +secondNumber);
        	
			
			}
			catch (InputMismatchException e) 
			{
				String msg=e.getMessage();
	            System.out.println(msg);
	            return; 
       		}
       	
	}
}
