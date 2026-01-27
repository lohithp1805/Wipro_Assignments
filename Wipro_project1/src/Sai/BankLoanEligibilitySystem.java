package Sai;
import java.util.*;
public class BankLoanEligibilitySystem {
	public static void main(String[] args) {
		ArrayList<Integer> age =new ArrayList<>();
		ArrayList<Integer> score =new ArrayList<>();
		ArrayList<Double> Income =new ArrayList<>();
		
		age.add(17);
		age.add(21);
		age.add(35);
		
		score.add(750);
		score.add(800);
		score.add(650);
		
		Income.add(25000.00);
		Income.add(50000.00);
		Income.add(75000.00);
		
		System.out.println("Bank loan Eligibility");
		for(Integer a:age) {
			for(Integer s:score) {
				for(Double d:Income) {				
					if(a>18&& s>600&& d>25000.00) {
						System.out.println(a+"yrs of age  "+s+" of CIBIL score "+d+" of Income is Eligible to take Loan");
					}else {
						System.out.println(a+"yrs of age  "+s+" of CIBIL score "+d+" of Income is Not Eligible to take Loan");
				}
			
				}
			}
			}
		
	}

}
