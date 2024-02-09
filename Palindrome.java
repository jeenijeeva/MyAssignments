package HomeAssignment2;

public class Palindrome {

		public static void main(String[] args) {
			int input =121 ,output =0,  temp =input;
			for(;input!=0;input =input/10) {
				int reminder = input%10;
				
				output = output*10+reminder;
				
			
			}
			 if(output ==temp) {
				 
				 System.out.println(output + " Number is a Palindrome");
			 }else {
				 System.out.println(output + " Number is not a Palindrome");
			 }
        }
	}
