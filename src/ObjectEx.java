
public class ObjectEx {
	private int id;
	private String name;

	public ObjectEx(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof ObjectEx))
			return false;
		if (obj == this)
			return true;
		return this.getId() == ((ObjectEx) obj).getId();
	}

	
	public int hashCode() {
		return id;
	}

	public static void main(String[] args) {
		ObjectEx JavaClass1 = new ObjectEx(1, "JavaClass");
		ObjectEx JavaClass2 = new ObjectEx(1, "JavaClass");
		System.out.println("JavaClass1 hashcode = " + JavaClass1.hashCode());
		System.out.println("JavaClass1 hashcode = " + JavaClass2.hashCode());
		System.out.println("Checking equality between JavaClass1 and JavaClass2 = " + JavaClass1.equals(JavaClass2));
	}


}
