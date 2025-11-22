package _27926.q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address,
                    String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String managerPhone,
                    String employeeName, int employeeId,
                    String designation, String contactNumber) {
        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, managerPhone);

        if (employeeName == null || employeeName.isEmpty()) {
            throw new PayrollDataException("Employee name cannot be empty");
        }
        if (employeeId <= 0) {
            throw new PayrollDataException("Employee ID must be > 0");
        }
        if (designation == null || designation.isEmpty()) {
            throw new PayrollDataException("Designation cannot be empty");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Contact number must be 10 digits");
        }

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
