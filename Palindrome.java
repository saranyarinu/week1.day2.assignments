package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="malayalam";
		String rev=""; 
		boolean palindrome =false;
		for(int i=str.length()-1; i>=0;i--)
		{
			rev=rev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
            palindrome = true;
        }
		System.out.println(palindrome);

	}

}
