package _27926.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter entity ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter created date: ");
            String createdDate = sc.nextLine();

            System.out.print("Enter updated date: ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter company name: ");
            String companyName = sc.nextLine();

            System.out.print("Enter company address: ");
            String companyAddress = sc.nextLine();

            System.out.print("Enter company phone (10 digits): ");
            String companyPhone = sc.nextLine();

            System.out.print("Enter company email: ");
            String companyEmail = sc.nextLine();

            System.out.print("Enter department name: ");
            String deptName = sc.nextLine();

            System.out.print("Enter department code: ");
            String deptCode = sc.nextLine();

            System.out.print("Enter manager name: ");
            String managerName = sc.nextLine();

            System.out.print("Enter manager email: ");
            String managerEmail = sc.nextLine();

            System.out.print("Enter manager phone (10 digits): ");
            String managerPhone = sc.nextLine();

            System.out.print("Enter employee name: ");
            String employeeName = sc.nextLine();

            System.out.print("Enter employee ID: ");
            int employeeId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter employee contact number (10 digits): ");
            String contactNumber = sc.nextLine();

            System.out.print("Enter total days: ");
            int totalDays = sc.nextInt();

            System.out.print("Enter present days: ");
            int presentDays = sc.nextInt();

            System.out.print("Enter leave days: ");
            int leaveDays = sc.nextInt();

            System.out.print("Enter housing allowance: ");
            double housingAllowance = sc.nextDouble();

            System.out.print("Enter transport allowance: ");
            double transportAllowance = sc.nextDouble();

            System.out.print("Enter tax deduction: ");
            double taxDeduction = sc.nextDouble();

            System.out.print("Enter loan deduction: ");
            double loanDeduction = sc.nextDouble();

            System.out.print("Enter basic salary: ");
            double basicSalary = sc.nextDouble();

            PayrollRecord record = new PayrollRecord(
                    id, createdDate, updatedDate,
                    companyName, companyAddress, companyPhone, companyEmail,
                    deptName, deptCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary
            );

            double netSalary = record.calculateNetSalary();

            System.out.println("\n===== PAYROLL RECORD (ID: 27884) =====");
            System.out.println("Company: " + record.getCompanyName());
            System.out.println("Department: " + record.getDepartmentName()
                    + " (" + record.getDepartmentCode() + ")");
            System.out.println("Manager: " + record.getManagerName());
            System.out.println("Employee: " + record.getEmployeeName()
                    + " | EmpID: " + record.getEmployeeId()
                    + " | Designation: " + record.getDesignation());
            System.out.println("Basic Salary: " + record.getBasicSalary());
            System.out.println("Total Allowance: " + record.getTotalAllowance());
            System.out.println("Total Deduction: " + record.getTotalDeduction());
            System.out.println("Gross Salary: " + record.getGrossSalary());
            System.out.println("Net Salary: " + record.getNetSalary()
                    + " | 27884");

        } catch (PayrollDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
