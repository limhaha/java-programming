
public class PurchaseDemo {

	public static void main(String[] args) {
		double total = 0;
		Purchase item = new Purchase();
		
		item.setName("Oranges");
		item.setPrice(10, 2.99);
	    item.setNumberBought(24);
	    item.writeOutput();
	    System.out.print("Total cost of oranges : $");
	    
	    total = total + item.getTotalCost();
	    System.out.println(item.getTotalCost() + "\n");
	    
	    item.setName("Eggs");
		item.setPrice(12, 1.69);
	    item.setNumberBought(36);
	    item.writeOutput();
	    System.out.print("Total cost of eggs : $");
	    
	    total = total + item.getTotalCost();
	    System.out.println(item.getTotalCost() + "\n");
	    
	    item.setName("Apples");
		item.setPrice(3, 1.00);
	    item.setNumberBought(20);
	    item.writeOutput();
	    System.out.print("Total cost of apples : $");
	    
	    total = total + item.getTotalCost();
	    System.out.println(item.getTotalCost() + "\n");
	    
	    item.setName("Watermelons");
		item.setPrice(1, 4.39);
	    item.setNumberBought(2);
	    item.writeOutput();
	    System.out.print("Total cost of watermelons : $");
	    
	    total = total + item.getTotalCost();
	    System.out.println(item.getTotalCost() + "\n");
	    
	    item.setName("Bagels");
		item.setPrice(6, 3.50);
	    item.setNumberBought(12);
	    item.writeOutput();
	    System.out.print("Total cost of bagels : $");
	    
	    total = total + item.getTotalCost();
	    System.out.println(item.getTotalCost() + "\n");
	    
	    
	    System.out.print("Total cost of five items : $");
	    System.out.println(total);
	}

}
