
public class PersonAddress {
	private String firstName, lastName, eMailAddress, phoneNumber;
	public static final String nationality = "Korea";
	
	public String getFirstName() {
		return lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public String geteMailAffress() {
		return eMailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void print() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("E-mail address: " + eMailAddress);
		System.out.println("PhoneNumber: " + phoneNumber);
	}
	public boolean equals(PersonAddress other) {
		return this.firstName.contentEquals(other.firstName) &&
				this.lastName.contentEquals(other.lastName);
	}

}
