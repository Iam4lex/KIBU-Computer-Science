/**
 * @(#)ExceptionTest.java
 *
 *
 * @author 
 * @version 1.00 2023/10/23
 */
import java.util.Scanner;
public class ExceptionTest {
        
    /**
     * Creates a new instance of <code>ExceptionTest</code>.
     */
    public ExceptionTest() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        try{
        	System.out.print("Enter the first number : ");
        	num1 = sc.nextInt();
        	System.out.print("Enter the second number : ");
        	num2 = sc.nextInt();
        		System.out.println("Your numbers are " + num1 + " and " + num2 );
        	if(num1< 0 && num2 < 0)
        		throw new NegativeNumberException("Enter nonNegative Numbers");
        }
        catch (NegativeNumberException e)
        {
        	System.out.println("caught an exception:"+ e.getMessage());
        }
       
    }
}
