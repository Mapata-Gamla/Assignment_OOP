package _27926.q1;

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

            System.out.print("Enter hospital name: ");
            String hospitalName = sc.nextLine();

            System.out.print("Enter hospital address: ");
            String hospitalAddress = sc.nextLine();

            System.out.print("Enter hospital phone (10 digits): ");
            String hospitalPhone = sc.nextLine();

            System.out.print("Enter hospital email: ");
            String hospitalEmail = sc.nextLine();

            System.out.print("Enter department name: ");
            String departmentName = sc.nextLine();

            System.out.print("Enter department code: ");
            String departmentCode = sc.nextLine();

            System.out.print("Enter doctor name: ");
            String doctorName = sc.nextLine();

            System.out.print("Enter doctor specialization: ");
            String specialization = sc.nextLine();

            System.out.print("Enter doctor email: ");
            String doctorEmail = sc.nextLine();

            System.out.print("Enter doctor phone (10 digits): ");
            String doctorPhone = sc.nextLine();

            System.out.print("Enter nurse name: ");
            String nurseName = sc.nextLine();

            System.out.print("Enter nurse shift (Day/Night): ");
            String shift = sc.nextLine();

            System.out.print("Enter nurse years of experience: ");
            int yearsExp = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter patient gender (Male/Female/Other): ");
            String gender = sc.nextLine();

            System.out.print("Enter patient contact number: ");
            String patientContact = sc.nextLine();

            System.out.print("Enter admission date: ");
            String admissionDate = sc.nextLine();

            System.out.print("Enter room number: ");
            String roomNumber = sc.nextLine();

            System.out.print("Enter room charges: ");
            double roomCharges = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter diagnosis: ");
            String diagnosis = sc.nextLine();

            System.out.print("Enter treatment given: ");
            String treatmentGiven = sc.nextLine();

            System.out.print("Enter treatment cost: ");
            double treatmentCost = sc.nextDouble();

            System.out.print("Enter doctor fee: ");
            double doctorFee = sc.nextDouble();

            System.out.print("Enter medicine cost: ");
            double medicineCost = sc.nextDouble();

            HospitalRecord record = new HospitalRecord(
                    id, createdDate, updatedDate,
                    hospitalName, hospitalAddress, hospitalPhone, hospitalEmail,
                    departmentName, departmentCode,
                    doctorName, specialization, doctorEmail, doctorPhone,
                    nurseName, shift, yearsExp,
                    patientName, age, gender, patientContact,
                    admissionDate, roomNumber, roomCharges,
                    diagnosis, treatmentGiven, treatmentCost,
                    doctorFee, medicineCost
            );

            double finalBill = record.generateBill();


            System.out.println("\n===== HOSPITAL RECORD (ID: 27884) =====");
            System.out.println("Hospital: " + record.getHospitalName());
            System.out.println("Department: " + record.getDepartmentName()
                    + " (" + record.getDepartmentCode() + ")");
            System.out.println("Doctor: " + record.getDoctorName() +
                    " [" + record.getSpecialization() + "]");
            System.out.println("Nurse: " + record.getNurseName()
                    + " (" + record.getShift() + " shift)");
            System.out.println("Patient: " + record.getPatientName()
                    + ", Age: " + record.getAge()
                    + ", Gender: " + record.getGender());
            System.out.println("Room: " + record.getRoomNumber()
                    + ", Charges: " + record.getRoomCharges());
            System.out.println("Diagnosis: " + record.getDiagnosis());
            System.out.println("Treatment: " + record.getTreatmentGiven()
                    + ", Cost: " + record.getTreatmentCost());
            System.out.println("Doctor fee: " + record.getDoctorFee());
            System.out.println("Medicine cost: " + record.getMedicineCost());
            System.out.println("FINAL BILL (with student ID): "
                    + finalBill + " | 27884");

        } catch (HospitalDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
