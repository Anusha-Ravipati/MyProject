package assignment2;
import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string:");
		String inputString=sc.nextLine();
		int strlen=inputString.length();
		String outputString="";
		for(int i=0;i<strlen;i++)
		{
			char ch=inputString.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch != 'A' 
					&& ch != 'E' && ch != 'I' && ch!= 'O' && ch != 'U')
			{
				outputString+=ch;
			}
		}
		System.out.println(outputString);
		sc.close();

	}

}
