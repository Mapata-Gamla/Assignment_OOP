package _27926.q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String companyName, String address,
                      String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);

        if (departmentName == null || departmentName.isEmpty()) {
            throw new PayrollDataException("Department name cannot be empty");
        }
        if (departmentCode == null || !departmentCode.matches("[a-zA-Z0-9]{3,}")) {
            throw new PayrollDataException("Department code must be alphanumeric and at least 3 chars");
        }

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
