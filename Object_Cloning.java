package firstProject;
import java.io.Serializable;

public class Object_Cloning implements Cloneable {
	private String name;
	private String college;
	
	public Object_Cloning (String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	public static void main(String args[]) {
		Object_Cloning student1 = new Object_Cloning("Ramesh", "ABC");
        try {
        	Object_Cloning student2 = (Object_Cloning) student1.clone();
            System.out.println(student2.getName());
            System.out.println(student2.getCollege());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
