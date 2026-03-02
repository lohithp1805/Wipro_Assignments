package Sai;
import java.util.*;

public class WeatherAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float temp=sc.nextFloat();
		boolean isHot=false;
//		int threshhold=sc.nextInt();
		sc.nextLine();
		String city=sc.nextLine();
		if (temp>30) {
			isHot=true;		
	}
		System.out.println("City: "+city);
		System.out.println("Temperature: "+temp);
		System.out.println("condition: "+(isHot ? "Hot Day" : "Normal Day"));
		sc.close();
}
}
		

