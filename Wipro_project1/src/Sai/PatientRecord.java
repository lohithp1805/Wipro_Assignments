package Sai;

public class PatientRecord {
	private String name;
	private String status;
	private String healthIssue;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setstatus(String status) {
		this.status= status;
	}
	public void setIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}
	
	public String getName() {
		return name;
	}
	public String getstatus() {
		return status;
	}
	public String getIssue() {
		return healthIssue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRecord p = new PatientRecord();
		p.setName("lohith");
		p.setstatus("Fine");
		p.setIssue("Diabetic");
		System.out.println("Patient name: "  +  p.getName());
		System.out.println("Patient Status: "+ p.getstatus());
		System.out.println("Disease: "+ p.getIssue());
		
		
 
	}

}
