
public class PersonAddressDemo {

	public static void main(String[] args) {
		PersonAddress tom = new PersonAddress();
		PersonAddress jim = new PersonAddress();
		
		tom.setName("Tom", "Cruise");
		tom.seteMailAddress("tom@google.com");
		tom.setPhoneNumber("0123456");
		jim.setName("Jim",  "Rogers");
		jim.seteMailAddress("jim@naver.com");
		jim.setPhoneNumber("3456789");
		
		tom.print();
		jim.print();
		System.out.println(tom.equals(jim)?
				("Same") : ("Different"));
		
	}

}
