package com.softserve.generic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Student implements Comparable<Student> {

	public static class StudentById implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getId() - o2.getId();
		}
	}

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}

public class AppList {
	public static void main(String[] args) {
		/*-
		List<String> list = new ArrayList<>();
		list.add("11");
		list.add("15");
		list.add("18");
		System.out.println("First:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i = " + i + "  Element of list = " + list.get(i));
		}
		list.add("20");
		list.add(1, "13");
		System.out.println("Second:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("i = " + i + "  Element of list = " + list.get(i));
		}
		//
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element.equals("18")) {
				iterator.remove();
			} else {
				System.out.print(element + "  ");
			}
		}
		System.out.println("\nlist = " + list);
		*/
		//
		/*-
		Set<String> s = new HashSet<>();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i])) {
				System.out.println("Duplicate detected: " + args[i]);
			}
		}
		System.out.println(s.size() + " distinct words detected: " + s);
		*/
		//
		/*-
		Student[] arr = {new Student(1,"ivan"), new Student(2,"petro"), new Student(1,"ivan")};
		Set<Student> s = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!s.add(arr[i])) {
				System.out.println("i = " + i + "  Duplicate detected: " + arr[i]);
			}
		}
		System.out.println(s.size() + " distinct words detected: " + s);
		*/
		//
		/*-
		Student[] arr = {new Student(1,"ivan"), new Student(2,"petro"), new Student(11,"anna")};
		System.out.println("Original Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		*/
		//
		/*-
		List<Student> list = new ArrayList<>();
		list.add(new Student(2, "petro"));
		list.add(new Student(11, "anna"));
		list.add(new Student(1, "ivan"));
		System.out.println("Original List: " + list);
		Collections.sort(list);
		//list.sort(new Student.StudentById());
		//Collections.sort(list, new Student.StudentById());
		System.out.println("Sorted List: " + list);
		*/
		//
		/*-
		//Set<Student> set = new TreeSet();
		Set<Student> set = new TreeSet<>(new Student.StudentById());
		set.add(new Student(2, "petro"));
		set.add(new Student(11, "anna"));
		set.add(new Student(1, "ivan"));
		System.out.println("Sorted List: " + set);
		*/
		//
		Map<String, String> map = new HashMap<>();
		map.put("key1", "one");
		map.put("key2", "two");
		// System.out.println("Map: " + map);
//		for (Map.Entry<String, String> entry : map.entrySet()) {
//			System.out.println("key = " + entry.getKey() + "  value = " + entry.getValue());
//		}
		//
		for (Iterator<Entry<String, String>> i = map.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			System.out.println("key = " + entry.getKey() + "  value = " + entry.getValue());
		}

	}
}
