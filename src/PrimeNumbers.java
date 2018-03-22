
public class PrimeNumbers {
	public static void main(String[] args) {
		for(int i=2; i<=100; i++)
		{ 
			for(int j=2; j<=100; j++) {
				if(j==i)
				{ 
					System.out.print(i +" ");
				}
				if (i%j==0)
				{
					break;
				}
			}
		}
		
	}

}
