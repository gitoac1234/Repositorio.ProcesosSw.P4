package prestamos;

public class Item {

	private String name;

	private ItemType type;

	private boolean isLended;

	public Item(String name, ItemType type) {

		setName(name);

		setType(type);

		setLended(false);

		
		
	}

	public void setLended(boolean lended) {

		isLended = lended;

	}

	public boolean isLended() {

		return isLended;

	}

	/**
	 * 
	 * @return the name
	 */

	public String getName() {

		return name;

	}

	/**
	 * 
	 * @param name
	 *            the name to set
	 */

	public void setName(String name) {

		this.name = name;

	}

	/**
	 * 
	 * @return the type
	 */

	public ItemType getType() {

		return type;

	}

	/**
	 * 
	 * @param type
	 *            the type to set
	 */

	public void setType(ItemType type) {

		this.type = type;

	}

	public boolean equals(Object obj) {

		if (obj instanceof Item) {

			Item other = (Item) obj;

			return this.getName().equals(other.getName()) &&

			this.getType().equals(other.getType());

		}

		return false;

	}

	public String toString() {

		return getName().toString();

	}

}
