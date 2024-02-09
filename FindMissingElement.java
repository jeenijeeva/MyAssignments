package HomeAssignment2;

import java.util.Arrays;

//Create a Java class named FindMissingElement as per the shared document
public class FindMissingElement 
{	

	    // Adding a main method in the FindMissingElement class as per the shared document
	    public static void main(String[] args) {

	        int[] arr =  {1, 4,3,2,8, 6, 7};
	        Arrays.sort(arr);

	        for (int i = arr[0]; i < arr.length; i++) 
	        {
	            if (i != arr[i - 1]) 
	            {
	                System.out.println("Missing Number : " + i);
	                break;
	            }
	        }
	    }
	}