package _27926.q1;

public final class HospitalRecord extends Bill {

    public HospitalRecord(int id, String createdDate, String updatedDate,
                          String hospitalName, String address,
                          String phoneNumber, String email,
                          String departmentName, String departmentCode,
                          String doctorName, String specialization,
                          String doctorEmail, String doctorPhone,
                          String nurseName, String shift, int yearsOfExperience,
                          String patientName, int age, String gender,
                          String contactNumber,
                          String admissionDate, String roomNumber, double roomCharges,
                          String diagnosis, String treatmentGiven, double treatmentCost,
                          double doctorFee, double medicineCost) {
        super(id, createdDate, updatedDate,
                hospitalName, address, phoneNumber, email,
                departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost);
    }

    public double generateBill() {
        double total = getRoomCharges() + getTreatmentCost()
                + getDoctorFee() + getMedicineCost();
        setTotalBill(total);
        return total;
    }
}
