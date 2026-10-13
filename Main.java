import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("          EMPLOYEE PAYROLL");
        System.out.println("----------------------------------");

        
        System.out.print("Enter Employee ID: ");
        String employeeID = input.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = input.nextDouble();

        
        Employee employee = new Employee(
                employeeID,
                employeeName,
                hourlyRate,
                hoursWorked
        );

       
        employee.displayEmployee();

        input.close();
    }
}
