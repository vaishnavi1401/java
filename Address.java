import java.io.*;
public class Address
{
	int flatno;
	String street;
	String city;
	String country;
	int pincode;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + flatno;
		result = prime * result + pincode;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (flatno != other.flatno)
			return false;
		if (pincode != other.pincode)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	public Address(int flatno, String street, String city, String country, int pincode) {
		super();
		this.flatno = flatno;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	public Address(Address ad) {
		 flatno=ad.flatno;
		street=ad.street;
		 city=ad.city;
 country=ad.country;
		 pincode=ad.pincode;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", street=" + street + ", city=" + city + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
}

