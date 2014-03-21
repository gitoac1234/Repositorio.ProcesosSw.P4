package prestamos;

public class PhoneNumber {

	private int countryCode, zoneCode, prefix, sufix;

	public PhoneNumber(int countryCode, int zoneCode, int prefix, int sufix) {

		setPrefix(prefix);

		setSufix(sufix);

		setZoneCode(zoneCode);

		setCountryCode(countryCode);

	}

	public int getPrefix() {

		return prefix;

	}

	public void setPrefix(int prefix) {

		this.prefix = prefix;

	}

	public int getSufix() {

		return sufix;

	}

	public void setSufix(int sufix) {

		this.sufix = sufix;

	}

	public int getZoneCode() {

		return zoneCode;

	}

	public void setZoneCode(int zoneCode) {

		this.zoneCode = zoneCode;

	}

	public int getCountryCode() {

		return countryCode;

	}

	public void setCountryCode(int countryCode) {

		this.countryCode = countryCode;

	}

	public String toString() {

		return "(+" + countryCode + " " + zoneCode + ") " + prefix + "-"
				+ sufix;

	}

	public boolean equals(Object obj) {

		if (obj instanceof PhoneNumber) {

			PhoneNumber other = (PhoneNumber) obj;

			return other.getSufix() == this.getSufix() &&

			other.getPrefix() == this.getPrefix() &&

			other.getZoneCode() == this.getZoneCode() &&

			other.getCountryCode() == this.getCountryCode();

		}

		return false;

	}

}
