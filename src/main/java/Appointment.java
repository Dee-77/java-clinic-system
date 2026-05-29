 public class Appointment {

    private Doctor doctor;
    private Patient patient;
    private String appointmentDate;

     
    public Appointment(Doctor doctor, Patient patient, String appointmentDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }

    
    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }
 
    public void displayAppointment() {
        System.out.println("==================================");
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Doctor: " + doctor.getName()
                + " (" + doctor.getSpecialization() + ")");
        System.out.println("Patient: " + patient.getName()
                + " (" + patient.getIllness() + ")");
        System.out.println("==================================");
    }
}