package prestamos;

public class Address {

	private String street, quarter, city, state, country, apNumber;

	private int number;

	public Address(String street, String quarter, String city, String state,
			String country, int number) {

		setStreet(street);

		setQuarter(quarter);

		setCity(city);

		setState(state);

		setCountry(country);

		setNumber(number);

		setApNumber("");

	}

	public Address(String street, String quarter, String city, String state,
			String country, int number, String apNumber) {

		this(street, quarter, city, state, country, number);

		setApNumber(apNumber);

	}

	public Address(Address ad) {

		this(ad.getStreet(), ad.getQuarter(), ad.getCity(), ad.getState(), ad
				.getCountry(), ad.getNumber(), ad.getApNumber());

	}

	public String getStreet() {

		return street;

	}

	public void setStreet(String street) {

		this.street = street;

	}

	public String getQuarter() {

		return quarter;

	}

	public void setQuarter(String quarter) {

		this.quarter = quarter;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

	public String getState() {

		return state;

	}

	public void setState(String state) {

		this.state = state;

	}

	public String getCountry() {

		return country;

	}

	public void setCountry(String country) {

		this.country = country;

	}

	public int getNumber() {

		return number;

	}

	public void setNumber(int number) {

		this.number = number;

	}

	public String getApNumber() {

		return apNumber;

	}

	public void setApNumber(String apNumber) {

		this.apNumber = apNumber;

	}

	public String toString() {

		return getStreet() + " " + getNumber() + getApNumber() + ", "
				+ getQuarter() + ", " + getCity() +

				", " + getState() + ", " + getCountry();

	}

	public boolean equals(Object obj) {

		if (obj instanceof Address) {

			Address other = (Address) obj;

			return other.getStreet().equals(this.getStreet()) &&

			other.getNumber() == this.getNumber() &&

			other.getApNumber() == this.getApNumber() &&

			other.getQuarter().equals(this.getQuarter()) &&

			other.getCity().equals(this.getCity()) &&

			other.getState().equals(this.getState()) &&

			other.getCountry().equals(this.getCountry());

		}

		return false;

	}

}
