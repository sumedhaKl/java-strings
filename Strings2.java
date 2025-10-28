import java.util.Scanner; 

public class Strings2{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        int employeeName = input.nextInt(); 

        int numberOfHoursWorkedInAWeek = 0; 
        double hourlyPayRate = 0; 
        int federalTaxWithholdingRate = 0; 
        int stateTaxWithholdingRate = 0;
        int totalDeduction = federalTaxWithholdingRate + stateTaxWithholdingRate; 
        int grossPay = 100;
        int netPay = grossPay-totalDeduction;
        System.out.print("Enter number of hours worked in a week:"); 
        System.out.print("Enter hourly pay rate;"); 
        System.out.print("Enter federal tax withholding rate:"); 
        System.out.print("Enter state tax withholding rate:"); 
        System.out.println("Employee Name:" + employeeName + "Hours Worked:" + numberOfHoursWorkedInAWeek + "Pay Rate:" + hourlyPayRate + grossPay+ "Federal Withholding" + federalTaxWithholdingRate + "State Withholding:" + stateTaxWithholdingRate + "Total Deduction:" + totalDeduction + "Net Pay:" + netPay); 
    } 
}
