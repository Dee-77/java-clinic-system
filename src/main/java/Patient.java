 public class Patient extends Person {

    private String illness;
 
    public Patient(int id, String name, int age, String illness) {
        super(id, name, age);
        setIllness(illness);
    }

     
    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        if (illness != null && !illness.trim().isEmpty()) {
            this.illness = illness;
        } else {
            System.out.println("Invalid illness.");
        }
    }
 
    @Override
    public void displayInfo() {
        System.out.println("===== Patient Information =====");
        super.displayInfo();
        System.out.println("Illness: " + illness);
    }
}