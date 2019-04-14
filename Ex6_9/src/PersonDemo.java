
public class PersonDemo {

	public static void main(String[] args) {
		Person people = new Person();
		
		people = Person.createToddler();
		System.out.println("Name: " + people.getName() + "  Age: " + people.getAge());
		
		people = Person.createPreschooler();
		System.out.println("Name: " + people.getName() + "  Age: " + people.getAge());
		
		people = Person.createAdolescent();
		System.out.println("Name: " + people.getName() + "  Age: " + people.getAge());
		
		people = Person.createTeenager();
		System.out.println("Name: " + people.getName() + "  Age: " + people.getAge());

	}

}
