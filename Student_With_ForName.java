package firstProject;

public class Student_With_ForName {
	private String name ;
	private String college ;

	public Student_With_ForName(String name  , String college) {
		super();
		this.name = name;
		this.college = college;	
	}

	public String getName () {
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	public String getCollege () {
		return college;
	}
	public void setCollege (String college) {
		this.college=college;
	}
	
	
	public static void main (String[] args) {
		try {

            String className = "net.javaguides.corejava.oops.Student";
            Class clasz = Class.forName(className);
            Student student = (Student) clasz.newInstance();
            System.out.println(student.getName());
            System.out.println(student.getCollege());

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	
}
