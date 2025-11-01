import java.util.Scanner;

class Strings2{ 
    public static void main(String[] args){ 
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter employee's name: ");
            String employeeName = input.nextLine();
            
            double grossPay = 100;
            System.out.print("\nEnter number of hours worked in a week:");
            double numberOfHoursWorkedInAWeek = input.nextDouble();
            System.out.print("\nEnter hourly pay rate:");
            double hourlyPayRate = input.nextDouble();
            System.out.print("\nEnter federal tax withholding rate:");
            double federalTaxWithholdingRate = input.nextDouble();
            federalTaxWithholdingRate = federalTaxWithholdingRate * 100;
            System.out.print("\nEnter state tax withholding rate:");
            double stateTaxWithholdingRate = input.nextDouble();
            stateTaxWithholdingRate = stateTaxWithholdingRate * 100;
            double totalDeduction = federalTaxWithholdingRate + stateTaxWithholdingRate;
            double netPay = grossPay-totalDeduction;
            System.out.println("\nEmployee Name: " + employeeName + "\nHours Worked: " + numberOfHoursWorkedInAWeek + "\nPay Rate: $" + hourlyPayRate + "\nGross Pay: $" + grossPay+ "\nDeductions: \nFederal Withholding: $" + federalTaxWithholdingRate + "\nState Withholding: $" + stateTaxWithholdingRate + "\nTotal Deduction: $" + totalDeduction + "\nNet Pay: $" + netPay);
        }
    } 
}
