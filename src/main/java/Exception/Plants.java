package Exception;

/**
 * Practical Task 2
 * 
 * @author Kristinafedina
 */

public class Plants {

	int size;
	Color color;
	Type type;

	public Plants(int sixe, Color color, Type type) {
		this.size = sixe;
		this.color = color;
		this.type = type;
	}

	
	
	@Override
	public String toString() {
		return "Plants [sixe=" + size + ", color=" + color + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Plants other = (Plants) obj;
		if (color != other.color)
			return false;
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public int getSixe() {
		return size;
	}

	public void setSixe(int sixe) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
