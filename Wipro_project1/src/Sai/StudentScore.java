package Sai;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String studentname=sc.nextLine();
		int engmarks=sc.nextInt();
		int matmarks=sc.nextInt();
		int total=engmarks+matmarks;
		System.out.println("studentname: "+studentname);
		System.out.println("Total: "+total);
		int percentage=(total)/2;
		System.out.println("percentage: "+percentage+"%");
		if(percentage>=90) {
			System.out.println("Grade: Garde A");
		}else if(percentage>=75) {
			System.out.println("Grade: Garde B");
		}else if(percentage>=50) {
			System.out.println("Grade: Garde C");
		}else {
			System.out.println("Grade: Fail");
		}
		sc.close();
		
		
	}

}
