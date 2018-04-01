
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
	 public static void main(String[] args) {
		    EmployeeSer emp = new EmployeeSer();
		    emp.firstName = "Abhishek";
		    emp.lastName = "Kumar";
		    try {
		      FileOutputStream fileOut = new FileOutputStream("./employee.txt");
		      ObjectOutputStream out = new ObjectOutputStream(fileOut);
		      out.writeObject(emp);
		      out.close();
		      fileOut.close();
		      System.out.printf("Serialized data is saved in ./employee.txt file");
		    } catch (IOException i) {
		      i.printStackTrace();
		    }
		  }

}
