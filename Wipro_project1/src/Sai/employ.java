package Sai;

public class employ {
	private int salary;
	void setsalary(int salary) {
		this.salary=salary;
	}
	int getsalary() {
		return salary;
	}
	public static void main(String[] args) {
		employ s=new employ();
		s.setsalary(500);
		System.out.println(s.getsalary());
	}

}
