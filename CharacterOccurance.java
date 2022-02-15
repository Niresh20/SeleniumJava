package week2.day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "All the best";
		
		
		  int count=0; 
		  for (int i = 0; i < input.length(); i++) {
		  if(input.charAt(i)=='e') { 
		  count++; 
		  } 
		  } 
		 System.out.println(count);
		 /*String newString = input.replace('e', 'x');
			String newString = input.replace("e", "");
			System.out.println(input.length()-newString.length());*/
	}
}
	
