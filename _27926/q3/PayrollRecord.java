package _27926.q3;

public final class PayrollRecord extends Salary {

    public PayrollRecord(int id, String createdDate, String updatedDate,
                         String companyName, String address,
                         String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String managerPhone,
                         String employeeName, int employeeId,
                         String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary) {
        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary);
    }

    public double calculateNetSalary() {
        double allowances = getTotalAllowance();
        double deductions = getTotalDeduction();
        double gross = getBasicSalary() + allowances;
        double net = getBasicSalary() + allowances - deductions;
        setGrossSalary(gross);
        setNetSalary(net);
        return net;
    }
}
