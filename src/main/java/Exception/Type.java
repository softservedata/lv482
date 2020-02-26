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
public enum Type {
	TREE, FLOWER, BUSH;

	public static Type stringToType(String s) throws TypeException {
		switch (s.toLowerCase()) {
		case "tree":
			return Type.TREE;
		case "pink":
			return Type.FLOWER;
		case "red":
			return Type.BUSH;
		default:
			throw new TypeException();
		}

	}
}
