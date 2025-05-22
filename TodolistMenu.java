package collectionone;
import java.util.Scanner;
import java.util.ArrayList;

public class TodolistMenu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<>();
		
		while(true) {
		System.out.println("--- To-Do List Menu ---");
		System.out.println("1. Add a task");
		System.out.println("2. Remove a task");
		System.out.println("3. View all tasks");
		System.out.println("4. Exit");
		
		System.out.println("Choose an option: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		switch(n) {
		case 1:
			System.out.println("Enter task: ");
			for(int i=0;i<10;i++) {
				String taskadd=sc.nextLine();
				if(taskadd.equals("done")) {
					break;
				}else {
				tasks.add(taskadd);
				}
			}
			System.out.println("Task added!");
			break;
			
		case 2:
			System.out.println("Enter task to remove: ");
			String task2=sc.nextLine();
			if(tasks.remove(task2)) {
			System.out.println("Task removed!");
			}else {
				System.out.println("Task not found.");
			}
			break;
			
		case 3:
			System.out.println("Tasks: ");
			if(tasks.isEmpty()) {
				System.out.println("No tasks available");
			}
			else {
			for(String pentask:tasks) {
				System.out.println(pentask);
			}
			}
			break;
			
		case 4:
			System.out.println("Exiting program. Goodbye!");
			return;
		
		default:
			System.out.println("Invalid option.Please try again. ");
	
		}
		
		}
		
	}

}
