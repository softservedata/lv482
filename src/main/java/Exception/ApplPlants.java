package Exception;

import java.util.Scanner;

public class ApplPlants {
	/**
	 * Practical Task 2
	 * 
	 * @author Kristina
	 * @throws ColorException
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("Enter size");
		System.out.println("Enter color");
		System.out.println("Enter type");

		int size = 0;
		String col = " ";
		Color color = Color.RED;
		String typ = " ";
		Type type = Type.TREE;

		try(Scanner sc = new Scanner(System.in)) {
			size = Integer.parseInt(sc.nextLine());
			col = sc.nextLine();
			color = Color.stringToCollor(col);
			typ = sc.nextLine();
			type = Type.stringToType(typ);
		} catch (NumberFormatException e) {
			System.err.println("Incorrect format.");
			System.exit(1);
		} catch (ColorException e) {
			System.err.println("Enter red, pink or green");
			e.printStackTrace();
			System.exit(1);
		} catch (TypeException e) {
			System.err.println("Enter tree, flower or bush");
			e.printStackTrace();
			System.exit(1);
		}catch( Exception e) {
			System.err.println(" Something went wrong.");
			System.exit(1);
		}

		Plants p = new Plants(size, color, type);
		System.out.println(p.toString());

	}

}
