package collectionone;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Studentlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        System.out.println("Enter 5 student names: ");
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println("Student List: " + students);

        System.out.println("Enter the name to search: ");
        String searchName = sc.nextLine();

        if (students.contains(searchName)) {
            System.out.println(searchName + " is present in the list");
        } else {
            System.out.println(searchName + " is not found in the list");
        }

        System.out.println("Enter the name to remove: ");
        String removeName = sc.nextLine();
        if (students.remove(removeName)) {
            System.out.println(removeName + " was removed.");
        } else {
            System.out.println(removeName + " was not found in the list.");
        }

        System.out.println("Updated list: " + students);

        Collections.sort(students);
        System.out.println("Sorted list: " + students);

        // ✅ This was the problematic line — now fixed:
        System.out.println("Enter an index (0-" + (students.size() - 1) + ") to get the student name: ");
        int index = sc.nextInt();
        sc.nextLine(); // consume newline

        if (index >= 0 && index < students.size()) {
            System.out.println("Student at index " + index + " is: " + students.get(index));
        } else {
            System.out.println("Invalid index!");
        }

        System.out.println("All students (printed using for-each loop):");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
