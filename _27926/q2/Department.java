package _27926.q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address,
                      String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);

        if (departmentName == null || departmentName.isEmpty()) {
            throw new SchoolDataException("Department name cannot be empty");
        }
        if (departmentCode == null || !departmentCode.matches("[a-zA-Z0-9]{3,}")) {
            throw new SchoolDataException("Department code must be alphanumeric and at least 3 characters");
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
