package _27926.q3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, String createdDate, String updatedDate,
                   String companyName, String address,
                   String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phone) {
        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber, email,
                departmentName, departmentCode);

        if (managerName == null || managerName.isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        if (managerEmail == null || !managerEmail.matches("^.+@.+\\..+$")) {
            throw new PayrollDataException("Invalid manager email");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new PayrollDataException("Phone must be 10 digits");
        }

        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public String getPhone() {
        return phone;
    }
}
