package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "My loop is dog";
		String[] array= test.split(" ");
		for(int i=0; i < array.length;i++)
		{
			if(i%2!=0)
			{
				String str= array[i];
				for(int j=str.length()-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
			}
			else {
					System.out.print(array[i]);
				}
			System.out.print(" ");
		}

	}

}
