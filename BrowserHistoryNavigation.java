package collectionone;
import java.util.Scanner;
import java.util.LinkedList;

public class BrowserHistoryNavigation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> history=new LinkedList<>();
		int choice;
		do {
			System.out.println("---- Browser History Menu ----");
			System.out.println("1. Visit a website");
			System.out.println("2. Go back (remove last visited site)");
			System.out.println("3. View history");
			System.out.println("4. Clear history");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1:
				System.out.println("Enter website URL to visit: ");
				String visitedsite=sc.nextLine();
				history.add(visitedsite);
				System.out.println(history+ "visited.");
				break;
				
			case 2:
				if(!history.isEmpty()) {
					String removedSite=history.removeLast();
					System.out.println("Went back from: "+removedSite);
				}else {
					System.out.println("History is empty. Nothing to go back to.");
				}
				break;
				
			case 3:
				if(history.isEmpty()) {
					System.out.println("No browsing history.");
				}else {
					System.out.println(history);
				}
				break;
				
			case 4:
				history.clear();
				System.out.println("All history cleared");
				break;
				
			case 5:
				System.out.println("Exiting browser...");
				break;
				
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}while(choice!=5);
		
		sc.close();
		
		}

}
