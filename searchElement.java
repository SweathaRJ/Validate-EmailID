package validateEmailID;

import java.util.ArrayList;
import java.util.Scanner;

public class searchElement {
	
	public static void main(String[] args) {
		 
		ArrayList<String> emailID=new ArrayList<String>();
		
		emailID.add("sweatha.rahul@abc.com");
		emailID.add("kaviya.dinesh@xyz.com");
		emailID.add("thabitha.suresh@imn.com");
		emailID.add("sharmi.sathya@xyz.com");
		emailID.add("hithvik.crazy@mno.com");
		emailID.add("smileyamef1@xyz.com");
		emailID.add("appu.sai@abc.com");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emailID : ");
	    String searchElement=sc.nextLine();
		 
		if(emailID.contains(searchElement)) {
			System.out.println("email ID " + searchElement + " is found");
		}
			else {
				System.out.println("email ID" + searchElement + " is not found");
			
		}
		
		
		
   }
}


