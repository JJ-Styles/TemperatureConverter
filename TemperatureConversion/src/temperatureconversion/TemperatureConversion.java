/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;
import java.util.Scanner;
/**
 *
 * @author t7047098
 */
public class TemperatureConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        do while (valid = false)
        {
            System.out.print("Please Enter whether you want to calculate Celsius (F) or Fahrenheit(C): ");
            String conversionString = keyboard.nextLine().toUpperCase();
            char conversion = conversionString.charAt(0);
            System.out.print("Please Enter the Temperature: ");
            double temp = keyboard.nextDouble();
            if (conversion == 'C')
            {
                System.out.println("The temperature in Fahrenheit is: " + temp *9 / 5 + 32);
                valid = true;
            }
            else if ( conversion == 'F')
            {
                System.out.println("The temperature in Celcius is: " + (temp - 32) * 5 /9);
                valid = true;
            }
        }       
    }
    
}
