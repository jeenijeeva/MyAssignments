package HomeAssignment2;

public class FibSers 
{

	public static void main(String[] args)
	{
		int n = 8, f1 = 0, f2 = 1;
	    for (int i = 1; i <= n; ++i)
	    {
	      System.out.print(f1 + ",");
	      int x = f1 + f2;
	      f1 = f2;
	      f2 = x;
	    }
		
	}

}
