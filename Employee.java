import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set; class Employee {

	String aadhaarid;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadhaarid == null) ? 0 : aadhaarid.hashCode());
		result = prime * result + ((ad == null) ? 0 : ad.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
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
		Employee other = (Employee) obj;
		if (aadhaarid == null) {
			if (other.aadhaarid != null)
				return false;
		} else if (!aadhaarid.equals(other.aadhaarid))
			return false;
		if (ad == null) {
			if (other.ad != null)
				return false;
		} else if (!ad.equals(other.ad))
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
	int age;
	String email;
	 float salary;
	 Address ad;
	 
	 public Employee(String aadhaarid, String name, int age, String email, float salary, Address ad) {
		// TODO Auto-generated constructor stub
		 ad= new Address(ad);
			this.aadhaarid=aadhaarid;
				this.name= name;
				this.age= age;
				this.email= email;
				 this.salary= salary;
				 System.out.println("hello");
		 
	}
	
	@Override
	public String toString() {
		return "Employee [aadhaarid=" + aadhaarid + ", name=" + name + ", age=" + age + ", email=" + email + ", salary="
				+ salary + ", ad=" + ad + "]";
	}
	public String getAadhaarid() {
		return aadhaarid;
	}
	public void setAadhaarid(String aadhaarid) {
		this.aadhaarid = aadhaarid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}

	}
	