import java.util.Scanner;

 

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        ClinicSystem clinicSystem = new ClinicSystem();

       
        Doctor doctor1 = new Doctor(1, "Dr. Ahmed", 45, "Cardiology");
        Doctor doctor2 = new Doctor(2, "Dr. Sara", 38, "Dermatology");

        Patient patient1 = new Patient(101, "Ali", 25, "Heart Disease");
        Patient patient2 = new Patient(102, "Mona", 30, "Skin Allergy");

     
        Person p1 = doctor1;
        Person p2 = patient1;

        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();
 
        doctor1.consultPatient(patient1);
        doctor1.consultPatient(patient1, "Patient should rest and take medicine.");

    
        Appointment appointment1 =
                new Appointment(doctor1, patient1, "2026-06-01");

        Appointment appointment2 =
                new Appointment(doctor2, patient2, "2026-06-02");

        clinicSystem.addAppointment(appointment1);
        clinicSystem.addAppointment(appointment2);

        int choice;

        do {

            System.out.println("\n===== CLINIC APPOINTMENT SYSTEM =====");
            System.out.println("1. View All Appointments");
            System.out.println("2. Add Appointment");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    clinicSystem.displayAllAppointments();
                    break;

                case 2:

                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();

                    System.out.print("Enter illness: ");
                    String illness = scanner.nextLine();

                    Patient newPatient =
                            new Patient(200, patientName, 20, illness);

                    Appointment newAppointment =
                            new Appointment(doctor1, newPatient, "2026-06-10");

                    clinicSystem.addAppointment(newAppointment);

                    break;

                case 3:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        scanner.close();
    }
}