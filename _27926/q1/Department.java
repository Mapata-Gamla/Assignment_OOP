package _27926.q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String hospitalName, String address,
                      String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);

        if (departmentName == null || departmentName.isEmpty()) {
            throw new HospitalDataException("Department name cannot be empty");
        }
        if (departmentCode == null || !departmentCode.matches("[a-zA-Z0-9]{3,}")) {
            throw new HospitalDataException("Department code must be alphanumeric and at least 3 chars");
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
