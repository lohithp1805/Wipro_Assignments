package Sai;
import java.util.*;
public class OnlineExamScoringSystem {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap=new HashMap<>();
		hmap.put("Maths", 80);
		hmap.put("Science", 65);
		hmap.put("Social", 90);
		
		int Avgscore=hmap.get("Maths")+hmap.get("Science")+hmap.get("Social")/3;
		
		System.out.println(Avgscore);
	}

}
