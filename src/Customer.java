
public class Customer {
	String name;
	int age;
	int ssn;
	String address;
	String city;
	int zipcode;
	
	public Customer(String name, int age, int ssn, String address, String city, int zipcode) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSsn() {
		return ssn;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
