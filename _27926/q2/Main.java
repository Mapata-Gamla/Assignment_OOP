package _27926.q2;

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

            System.out.print("Enter school name: ");
            String schoolName = sc.nextLine();

            System.out.print("Enter school address: ");
            String schoolAddress = sc.nextLine();

            System.out.print("Enter school phone (10 digits): ");
            String schoolPhone = sc.nextLine();

            System.out.print("Enter school email: ");
            String schoolEmail = sc.nextLine();

            System.out.print("Enter department name: ");
            String deptName = sc.nextLine();

            System.out.print("Enter department code: ");
            String deptCode = sc.nextLine();

            System.out.print("Enter teacher name: ");
            String teacherName = sc.nextLine();

            System.out.print("Enter subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter teacher email: ");
            String teacherEmail = sc.nextLine();

            System.out.print("Enter teacher phone (10 digits): ");
            String teacherPhone = sc.nextLine();

            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();

            System.out.print("Enter student roll number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student grade: ");
            String grade = sc.nextLine();

            System.out.print("Enter student contact number: ");
            String studentContact = sc.nextLine();

            System.out.print("Enter course name: ");
            String courseName = sc.nextLine();

            System.out.print("Enter course code: ");
            String courseCode = sc.nextLine();

            System.out.print("Enter credit hours: ");
            int creditHours = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter exam name: ");
            String examName = sc.nextLine();

            System.out.print("Enter max marks: ");
            int maxMarks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter exam date: ");
            String examDate = sc.nextLine();

            System.out.print("Enter obtained marks: ");
            double obtainedMarks = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter result remarks: ");
            String remarks = sc.nextLine();

            System.out.print("Enter tuition fee: ");
            double tuitionFee = sc.nextDouble();

            System.out.print("Enter exam fee: ");
            double examFee = sc.nextDouble();

            StudentRecord record = new StudentRecord(
                    id, createdDate, updatedDate,
                    schoolName, schoolAddress, schoolPhone, schoolEmail,
                    deptName, deptCode,
                    teacherName, subject, teacherEmail, teacherPhone,
                    studentName, rollNumber, grade, studentContact,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtainedMarks, remarks,
                    tuitionFee, examFee
            );

            double avgMarks = record.calculateAverageMarks();
            double totalFee = tuitionFee + examFee;
            record.setTotalFee(totalFee);

            System.out.println("\n===== STUDENT RECORD (ID: 27884) =====");
            System.out.println("School: " + record.getSchoolName());
            System.out.println("Department: " + record.getDepartmentName()
                    + " (" + record.getDepartmentCode() + ")");
            System.out.println("Teacher: " + record.getTeacherName()
                    + " | Subject: " + record.getSubject());
            System.out.println("Student: " + record.getStudentName()
                    + " | Roll: " + record.getRollNumber()
                    + " | Grade: " + record.getGrade());
            System.out.println("Course: " + record.getCourseName()
                    + " (" + record.getCourseCode() + "), Credit Hours: "
                    + record.getCreditHours());
            System.out.println("Exam: " + record.getExamName()
                    + " | Max Marks: " + record.getMaxMarks()
                    + " | Obtained: " + record.getObtainedMarks());
            System.out.println("Average Marks: " + avgMarks + "%");
            System.out.println("Remarks: " + record.getRemarks());
            System.out.println("Tuition Fee: " + record.getTuitionFee());
            System.out.println("Exam Fee: " + record.getExamFee());
            System.out.println("Total Fee: " + record.getTotalFee()
                    + " | 27884");

        } catch (SchoolDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
