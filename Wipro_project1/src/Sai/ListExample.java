package Sai;

import java.util.*;

public class ListExample {
public static void main(String[] args)
	{
List<String> names=new ArrayList<>();
//ArrayList<String> name= new ArrayList<>();
//ArrayList<String> name1= new ArrayList();
		names.add("Lohith ");
		names.add("Sai");
		names.add("ram");
		names.add(3, "joshi");
		names.addAll(names);
		names.addAll(2, names);
		names.addFirst("karuna");
		names.addLast("Sahithi");
		
		System.out.println(names.contains("Lohith "));
		System.out.println(names);
		
	}
 
}
