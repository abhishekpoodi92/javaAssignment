
public class OverloadEx {
	    int add(int num1, int num2)
	    {
	        return num1+num2;
	    }
	    int add(int num1, int num2, int num3)
	    {
	        return num1+num2+num3;
	    }
	    int add(int num1, int num2, int num3, int num4)
	    {
	        return num1+num2+num3+num4;
	    }
	    public static void main(String[] args) 
	    {    
	    	OverloadEx obj = new OverloadEx();
	  
	        System.out.println("Sum of two numbers: "+obj.add(5, 10));
	        
	        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
	     
	        System.out.println("Sum of four numbers: "+obj.add(11,  22, 43, 47));
	    }
	}

