package firstProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Object_Deserialization {
	public static void main(String[] args) {
		// path to store the serialized object
		String filePath = "sample.txt";
		Student s1 = new Student("rabi3","NY");
		//System.out.println(s1.getName());
		try {
			//Serialization
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream (fileOutputStream);
			objectOutputStream.writeObject(s1);
			objectOutputStream.flush();
			objectOutputStream.close();
			
			//Deserialization
			FileInputStream fileInputStream = new FileInputStream (filePath);
			ObjectInputStream objectInputStream = new ObjectInputStream (fileInputStream);
			Student s2 = (Student)objectInputStream.readObject();
			fileInputStream.close();
			System.out.println(s2.getName());
			System.out.println(s2.getCollege());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
