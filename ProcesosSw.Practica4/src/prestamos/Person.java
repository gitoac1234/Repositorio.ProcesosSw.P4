package prestamos;

import java.util.LinkedList;
import java.util.List;

public class Person {

	private List<PhoneNumber> phoneNumbers;

	private String name;

	private Address address;

	public Person(String name) {

		setName(name);

		phoneNumbers = new LinkedList<PhoneNumber>();

	}

	public Person(String name, Address ad) {

		this(name);

		setAddress(ad);

	}

	public Person(Person p) {

		this(p.getName(), p.getAddress());

		for (PhoneNumber pn : p.getPhoneNumbers()) {

			this.addPhoneNumber(pn);

		}

	}

	public void addPhoneNumber(PhoneNumber pn, int pos) {

		phoneNumbers.add(pos, pn);

	}

	public void removePhoneNumber(int pos) {

		phoneNumbers.remove(pos);

	}

	public void removePhoneNumber(PhoneNumber pn) {

		phoneNumbers.remove(pn);

	}

	/**
	 * 
	 * @return the phoneNumbers
	 */

	public List<PhoneNumber> getPhoneNumbers() {

		return new LinkedList<PhoneNumber>(phoneNumbers);

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
	 * @return the address
	 */

	public Address getAddress() {

		return address;

	}

	/**
	 * 
	 * @param address
	 *            the address to set
	 */

	public void setAddress(Address address) {

		this.address = address;

	}

	public boolean equals(Object obj) {

		if (obj instanceof Person) {

			Person p = (Person) obj;

			return p.getName().equals(this.getName());

		}

		return false;

	}

	public String toString() {

		return getName().toString();

	}

	public void addPhoneNumber(PhoneNumber pn) {

		phoneNumbers.add(pn);

	}

	public int numberOfPhoneNumbers() {

		return phoneNumbers.size();

	}

}