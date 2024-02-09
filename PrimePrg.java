package HomeAssignment2;

public class PrimePrg 
{

	public static void main(String[] args) 
	{
	
		int num = 19;
	    boolean Val = false;
	    for (int i = 2; i <= num / 2; ++i)
	    {
	 
	      if (num % i == 0) 
	      {
	        Val = true;
	        break;
	      }
	    }

	    if (!Val)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	
	}

