package ch02pc10;
import java.util.Scanner;
/**
 *
 * @author FRANK.OLSON
 * date     10/18/2017
 */
public class Ch02PC10 {
    
    public static void main(String[] args) {
        //variables
        double test1, test2, test3, testAvg;
        
        //Create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Get input
        System.out.print("What was the result of the first test? ");
        test1 = keyboard.nextDouble();
        
        System.out.print("What was the result of the second test? ");
        test2 = keyboard.nextDouble();
        
        System.out.print("What was the result of the third test? ");
        test3 = keyboard.nextDouble();
        
        //Calculations
        testAvg = (test1 + test2 + test3) / 3;
        
        //Display results to the user
        System.out.print("The average of your test results is: " + testAvg);
               
        
    }
}
