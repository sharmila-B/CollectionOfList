package Iteratorpgms;

import java.util.*;
public class EmailFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> emails=new ArrayList<>(Arrays.asList("Win a car now","Meeting at 12PM","You won $1,000,000","Lunch Plans..?","Limited offer"));
		
		Iterator<String> it=emails.iterator();
		
		while(it.hasNext()) {
			String email=it.next();
			if(email.toLowerCase().contains("win")||email.toLowerCase().contains("offer")) {
				it.remove();
			}
		}
		
		System.out.println("Filtered Emails: ");
		for(String e:emails) {
			System.out.println("- " +e);
		}
		
		
	}

}
