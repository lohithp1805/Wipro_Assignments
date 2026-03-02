package Sai;


import java.util.LinkedList;

public class PatientManagement {
public static void main(String[] args)
{
LinkedList<String>patients=new LinkedList<>();

patients.add("lohith");
patients.add("joshith");
patients.add(" rama");

patients.addFirst("Emergency-devi");

patients.addLast("sahithi");

System.out.println("Patient List:" + patients);


System.out.println("First Patient :" + patients.getFirst());


System.out.println("First Patient :" + patients.getLast());

System.out.println("Is lohith present? " +patients.contains("lohith"));

System.out.println("Postion of joshith: " +patients.indexOf("joshith"));

System.out.println("Treated Patient: " + patients.removeFirst());
patients.remove("devi");

System.out.println("Total Remaining Patients: " + patients.size());

System.out.println("Updated Patient List :");

for(String patient : patients)
{
	System.out.println(patient);

}





	
}

}
