package prestamos;

public class ItemType {

	private String typeName = null;

	public ItemType(String name) {

		setName(name);

	}

	private void setName(String name) {

		typeName = name;

	}

	public String getName() {

		return typeName;

	}

	public boolean equals(Object obj) {

		if (obj instanceof ItemType) {

			ItemType other = (ItemType) obj;

			return this.getName().equals(other.getName());

		}

		return false;

	}

	public String toString() {

		return getName().toString();

	}

}
