package Sai;

// Patient class
class Patient {
    private String id;
    private String name;
    private int age;
    private String illness;

    void setAllInfo(String id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    void display() {
        System.out.println("Patient Id : " + id);
        System.out.println("Patient Name : " + name);
        System.out.println("Patient Age : " + age);
        System.out.println("Patient Status : " + illness);
    }
}

// Abstract Doctor class
abstract class Doctor {
    public void docInfo(String docName, String specialisation) {
        System.out.println("Doctor Name : " + docName);
        System.out.println("Doctor Speciality : " + specialisation);
    }

    abstract void diagnosed();
}

// Child class
class DocS extends Doctor {
    void diagnosed() {
        System.out.println("You have no health issues");
    }
}

// Main class (ONLY public class)
public class HealthCareSector {
    public static void main(String[] args) {

        Patient pr = new Patient();
        pr.setAllInfo("123", "Rushi", 24, "Fine");
        pr.display();

        DocS d = new DocS();
        d.docInfo("Dr. Purohit", "Eye Specialist");
        d.diagnosed();
    }
}
