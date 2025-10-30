import java.util.Scanner;

class Strings2{ 
    public static void main(String[] args){ 
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter employee's name: ");
            String employeeName = input.nextLine();
            
            int grossPay = 100;
            System.out.print("\nEnter number of hours worked in a week:");
            int numberOfHoursWorkedInAWeek = input.nextInt();
            System.out.print("\nEnter hourly pay rate;");
            double hourlyPayRate = input.nextDouble();
            System.out.print("\nEnter federal tax withholding rate:");
            int federalTaxWithholdingRate = input.nextInt();
            System.out.print("\nEnter state tax withholding rate:");
            int stateTaxWithholdingRate = input.nextInt();
            int totalDeduction = federalTaxWithholdingRate + stateTaxWithholdingRate;
            int netPay = grossPay-totalDeduction;
            System.out.println("\nEmployee Name:" + employeeName + "Hours Worked:" + numberOfHoursWorkedInAWeek + "Pay Rate:" + hourlyPayRate + "Gross Pay:" + grossPay+ "Deductions: \nFederal Withholding" + federalTaxWithholdingRate + "\nState Withholding:" + stateTaxWithholdingRate + "\nTotal Deduction:" + totalDeduction + "Net Pay" + netPay);
        }
    } 
}
