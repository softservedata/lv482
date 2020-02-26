/**
 * 
 */
package Exception;

/**
 * Practical Task 2
 * 
 * @author Kristina
 *
 */
public enum Color {
	GREEN, RED, PINK;

	public static Color stringToCollor(String s) throws ColorException {
		switch (s.toLowerCase()) {
		case "green":
			return Color.GREEN;
		case "pink":
			return Color.PINK;
		case "red":
			return Color.RED;
		default:
			throw new ColorException();
		}
	}
}