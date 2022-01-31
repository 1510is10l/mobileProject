package myProject;

public class HomeWork {

	public static void main(String[] args) {
		
		int sum = 0;

		
		for(int i = 0; i <= 100; i++)
		{
			boolean prime = true;

			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					prime = false;
					break;
				}
			}
			
			if(prime)
			{
				sum = sum + i;
			}
		}
		System.out.println("The sum of the prime numbers: " + sum);
	}

}
