 public class Doctor extends Person {

    private String specialization;

   
    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        setSpecialization(specialization);
    }
 
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization != null && !specialization.trim().isEmpty()) {
            this.specialization = specialization;
        } else {
            System.out.println("Invalid specialization.");
        }
    }

    
    @Override
    public void displayInfo() {
        System.out.println("===== Doctor Information =====");
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }


    public void consultPatient(Patient patient) {
        System.out.println("Doctor " + getName() +
                " is consulting patient " + patient.getName());
    }

    public void consultPatient(Patient patient, String notes) {
        System.out.println("Doctor " + getName() +
                " consulted patient " + patient.getName());
        System.out.println("Notes: " + notes);
    }
}