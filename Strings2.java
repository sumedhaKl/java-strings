import java.util.Scanner; 
import java.text.DecimalFormat; 
public class Strings2{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int numberOfHoursWorkedInAWeek = 0; 
        double hourlyPayRate = 0; 
        double federalTaxWithholdingRate = 0; 
        float stateTaxWithholdingRate = 0; System.out.print("Enter employee name:"); System.out.print("Enter number of hours worked in a week:"); System.out.print("Enter hourly pay rate;"); System.out.print("Enter federal tax withholding rate:"); System.out.print("Enter state tax withholding rate:"); System.out.println(numberOfHoursWorkedInAWeek + hourlyPayRate + federalTaxWithholdingRate + stateTaxWithholdingRate); 
        return; 
    } 
}