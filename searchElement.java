package validateEmailID;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String searchElement;
		System.out.println("Enter emailID : ");
		Scanner sc=new Scanner(System.in);
		searchElement=sc.nextLine();
		String regex = "^(.+)@(.+)$";
		Matcher match=Pattern.compile(regex).matcher(searchElement);
		 
		if(match.matches() && emailID.stream().anyMatch(mail -> mail.equals(searchElement))) {
			System.out.println("email ID " + searchElement + " is found");
		}
			else {
				System.out.println("email ID" + searchElement + " is not found");
			
		}
		sc.close();
		
		
		
   }
}


