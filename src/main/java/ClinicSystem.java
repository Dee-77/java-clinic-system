import java.util.ArrayList;
import java.util.List;

 

public class ClinicSystem {

 
    private List<Appointment> appointments;

 
    public ClinicSystem() {
        appointments = new ArrayList<>();
    }

   
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added successfully.");
    }

     
    public void displayAllAppointments() {

        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        System.out.println("\n===== ALL APPOINTMENTS =====");

        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }
}