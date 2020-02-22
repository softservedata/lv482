package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();
		student.add(new Student("Ivan", 005));
		student.add(new Student("Ihor", 003));
		student.add(new Student("Lila", 005));
		student.add(new Student("Ana", 005));
		student.add(new Student("Ola", 003));

		printStudents(student, 005);

		student.sort(new StudentByName());

		System.out.println("List sorted by name " + student);

		student.sort(new StudentByCourse());

		System.out.println("List sorted by course " + student);

	}

	private String name;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	static class StudentByName implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());

		}
	}

	static class StudentByCourse implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {

			return (s1.getCourse() - s2.getCourse());

		}
	}

	static void printStudents(List<Student> students, int course) {
		Iterator itr = students.iterator();
		int count = 1;
		;
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			if (s.getCourse() == course) {

				System.out.println("Student " + s.getName());
			} else {

				count++;
			}

			if (count == 5) {
				System.out.println("No student at this course yet");
			}
		}

	}
}
