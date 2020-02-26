package com.softserve.treads;

import java.io.Serializable;

import com.google.gson.Gson;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	//
	protected static String bachelor;
	private int id;
	private String name;
	private transient String password;

	public Student(String bachelor, int id, String name, String password) {
		Student.bachelor = bachelor;
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", bachelor=" + bachelor + "]";
	}
}

public class DemoSerialization {
	/*-
	public static void main(String[] args) {
		Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
		System.out.println(student);
		File fw = new File("demo.cer");
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
			ostream.writeObject(student);
			ostream.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	*/
	//
	/*-
	public static void main(String[] args) {
		//Student.bachelor = "Mathematic";
		File fr = new File("demo.cer");
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
			Student unknown = (Student) istream.readObject();
			istream.close();
			System.out.println(unknown);
		} catch (ClassNotFoundException | IOException e) {
			System.err.println(e.getMessage());
		}
	}
	*/
	//
	public static void main(String[] args) {
		Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
		System.out.println(student);
		//
		Gson gson = new Gson();
		String myjson = gson.toJson(student);
		System.out.println(myjson);
		//
		Student student1 = (Student) gson.fromJson(myjson, Student.class);
		System.out.println(student1);
	}
}
