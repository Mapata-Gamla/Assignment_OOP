package _27926.q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, String createdDate, String updatedDate,
                   String hospitalName, String address,
                   String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization,
                   String doctorEmail, String doctorPhone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender,
                   String contactNumber) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExperience);

        if (patientName == null || patientName.isEmpty()) {
            throw new HospitalDataException("Patient name cannot be empty");
        }
        if (age <= 0) {
            throw new HospitalDataException("Age must be > 0");
        }
        if (!("Male".equalsIgnoreCase(gender) ||
                "Female".equalsIgnoreCase(gender) ||
                "Other".equalsIgnoreCase(gender))) {
            throw new HospitalDataException("Gender must be Male/Female/Other");
        }
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new HospitalDataException("Contact number cannot be empty");
        }

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
