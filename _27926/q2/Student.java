package _27926.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String address,
                   String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject,
                   String teacherEmail, String teacherPhone,
                   String studentName, int rollNumber,
                   String grade, String contactNumber) {
        super(id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone);

        if (studentName == null || studentName.isEmpty()) {
            throw new SchoolDataException("Student name cannot be empty");
        }
        if (rollNumber <= 0) {
            throw new SchoolDataException("Roll number must be > 0");
        }
        if (grade == null || grade.isEmpty()) {
            throw new SchoolDataException("Grade cannot be empty");
        }
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new SchoolDataException("Contact number cannot be empty");
        }

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
