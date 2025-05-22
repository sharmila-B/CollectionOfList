package collectionone;
import java.util.Scanner;
import java.util.ArrayList;


public class Todolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		
		System.out.println("Enter your tasks (type 'done' to stop): ");
		for(int i=0;i<5;i++) {
			String tasks=sc.nextLine();
			if(tasks.equals("done")) {
				break;
			}else {
				list.add(tasks);
			}
			
			}
		
		System.out.println("All tasks: "+list);
		
		System.out.println("Enter a task to remove: ");
		String removetask=sc.nextLine();
		if(list.remove(removetask)) {
			System.out.println("Task Removed");
		}else {
			System.out.println("Task not found in the list");
		}
		
		System.out.println("Task left: " +list.size());
		System.out.println("Task remaining: ");
		for(String task:list) {
			System.out.println(task);
		}	
		
	}
		
	}


