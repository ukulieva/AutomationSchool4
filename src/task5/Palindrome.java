package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Please, input word or phrase: ");
		Scanner scanner = new Scanner(System.in);
		String string=scanner.next();
		string=string.replace(" ", "");
		scanner.close();
		
		char stringArray []=string.toCharArray();
		char stringNewArray []=new char [stringArray.length];
		for (int i=0;i<stringArray.length;i++) {
				
			
			stringNewArray[i]=stringArray[stringArray.length-1-i];
	//		System.out.print(stringNewArray[i]);
		}
		
		if(Arrays.equals(stringArray, stringNewArray)) {
				System.out.print("This is palindrome.");
		}
		else
			System.out.print("This is not palindrome.");
	
	}
}
