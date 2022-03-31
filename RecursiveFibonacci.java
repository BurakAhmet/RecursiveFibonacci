import java.util.Scanner;//add scanner for find n'th fibonacci number. Then take input from user

public class Assignment3_2 {

	static int numOfRecursiveCall = 0;//to compare with traditional solution

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int n = in.nextInt();//input n for n'th fibonacci number
		System.out.println("The fibonacci number:"+fibonacci(n));
		System.out.println("Number of recursive call:" + numOfRecursiveCall);//to make comparison with the traditional method
		in.close();
	}

	private static int fibonacci(int n, int a, int b) {

		if (n == 0) //base case
		{
			return a;
		}

		else if (n == 1) //base case
		{
			return b;
		}

		else 
		{
			numOfRecursiveCall += 1;
			return fibonacci(n - 1, b, a + b); //decrease n so it can reach base case. Swipe a and b for next terms then add b to a.
		}
	}

	private static int fibonacci(int n) {
		
		return fibonacci(n, 0, 1); //recursive helper method
		
	}
	/* Thanks to helper method number of recursive call doesn't grow exponentially now. 
	It grows linear and this improve the program's efficiency. The traditional method was very inefficient.
	
	EXPLANATİON OF METHOD:
	initial method call fiboncacci(4)
	return fibonacci(4, 0, 1) number of recursive call=0
	recursive call fibonacci(3(n), 1, 1)-number of recursive call=0+1
	recursive call fibonacci(2(n), 1, 2)-number of recursive call=1+1
	recursive call fibonacci(1(n), 2, 3)-number of recursive call=2+1=3
	we reached the base case now because n=1 then we should return 3*/
}
