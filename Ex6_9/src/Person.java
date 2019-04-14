
public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String first, String last) { //two param
		this.name = first + " " + last;
	}
	public void setName(String name) { // one param
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static Person createToddler() {
		Person person = new Person();
		person.setName("A", "toddler");
		person.setAge(2);
		
		return person;
	}
	
	public static Person createPreschooler() {
		Person person = new Person();
		person.setName("A", "pre-schooler");
		person.setAge(5);
		
		return person;
	}
	
	public static Person createAdolescent() {
		Person person = new Person();
		person.setName("An", "adolescent");
		person.setAge(9);
		
		return person;
	}
	
	public static Person createTeenager() {
		Person person = new Person();
		person.setName("A", "teenager");
		person.setAge(15);
		
		return person;
	}
}
