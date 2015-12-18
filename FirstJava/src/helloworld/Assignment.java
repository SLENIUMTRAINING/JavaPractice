//This code calculates number between 1 and 1000 that are divisible by 3. 

package modulus_problem;
import javax.swing.JOptionPane;
public class Modulus_problem {
 public static void main(String[] args) 
 int counter = 0;
        		for (int i = 1; i < 1001; i++)
        		{
           			 if (i % 3 == 0)
            				{
               				 counter++;
            				}
       		 }
 
        JOptionPane.showMessageDialog( null, counter );
        System.exit(0);
    }
}
