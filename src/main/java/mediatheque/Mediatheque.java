package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}

	public void printOnlyCDs() {
		PrintCDVisitor CDprintor = new PrintCDVisitor();
		for (Item i : items){
			i.accept(CDprintor);
		}
		
	}
	public void  printOnlyBooks() {
		PrintBookVisitor BookPrintor = new PrintBookVisitor();
		for (Item i : items){
			i.accept(BookPrintor);
		}
	}


}
