package Sai;

public class Employee2 {

    public static void main(String[] args) {

        String[] arr = {"Renu Sai", "Akhil Kumar", "John Doe", "Meera"};

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("Employee_Name: " + s);

            if (s.length() > 10) {
                System.out.println("Type: Long Name");
            } else if (!s.contains(" ")) {
                System.out.println("Type: Single Word Name");
            } else {
                System.out.println("Type: Normal Name");
            }

            System.out.println("UpperCase_Word: " + s.toUpperCase());

            StringBuffer rev = new StringBuffer(s);
            System.out.println("Reversed_Word: " + rev.reverse());

            StringBuilder app = new StringBuilder(s);
            System.out.println("Appended_Word: " + app.append(" -verified"));
            System.out.println();
        }
    }
}
