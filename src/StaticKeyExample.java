
public class StaticKeyExample 
{
	public static void main(String[] args) {
	
		 Abc.show();
	}

}
class Abc
{
	static int i=10;
	static int j=20;
	public static void show()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
