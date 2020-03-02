package Exception;

/**
 *  Homework Task 2
 * @author Kristinafedina
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arr {

	public static void main(String[] args) {

		Random rd = new Random();
		List<Integer> listInt = new ArrayList<>();
		int listLength = 10;
		for (int i = 0; i < listLength; i++) {
			listInt.add(rd.nextInt(30));
			System.out.println(listInt.get(i));
		}

		Arr arr = new Arr();

		try {
			System.out.println("\n Sorted list" + arr.listFromTo(listInt, 3, 5));
		} catch (NullValueException | InvalidValueException | NegativeValueException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Something went wrong. Try one more time");
		}
		System.out.println("\nOriginal list" + listInt);

	}

	public <T> List<T> listFromTo(List<T> list, int start, int end)
			throws NullValueException, InvalidValueException, NegativeValueException {
		List<T> list1 = new ArrayList<T>();
		if (list.size() == 0) {
			throw new NullValueException("List is Empty ");
		}
		if ((end < start) || (end > list.size())) {
			throw new InvalidValueException();
		}
		if ((start < 0) || (end < 0)) {
			throw new NegativeValueException();
		}
		for (int i = start; i <= end; i++) {
			list1.add(list.get(i));
		}

		return list1;

	}
}
