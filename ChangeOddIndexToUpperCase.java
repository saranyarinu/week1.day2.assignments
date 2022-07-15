package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = new String("saranya rajendran");
		for(int i=0;i<=test.length()-1;i++)
		{			
			if(i%2==0)
			{				
				System.out.print(test.toUpperCase().charAt(i));
			}
			else
			{
				System.out.print(test.toLowerCase().charAt(i));
			}
			}

	}

}
